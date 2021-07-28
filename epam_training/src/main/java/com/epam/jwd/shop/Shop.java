package com.epam.jwd.shop;

import com.epam.jwd.entity.Drink;
import com.epam.jwd.storage.EmployeeList;
import com.epam.jwd.storage.ShopList;
import com.epam.jwd.storage.CoffeeList;
import com.epam.jwd.entity.Coffee;

import java.util.Collections;
import java.util.Objects;

/**
 * shop class with properties <b>_money</b>
 */
public class Shop implements ShopInterface {
    private static double money;

    static ShopList shopList = new ShopList();
    CoffeeList listOfItem = CoffeeList.getInstanceListOfItem();
    static EmployeeList employeeList = EmployeeList.getInstance();

    //Constructor - creating a new object
    public Shop(double money) {
        Shop.money = money;
    }

    /**
     * A method that adds coffee to the store's vault
     *
     * @param coffee
     */
    @Override
    public void add(Coffee coffee) {
        shopList.getCoffeeShop().add(coffee);
    }

    @Override
    public void printAllCoffee() {
        listOfItem.getList().sort(listOfItem::compareByPrice);
        System.out.println("\nShop inventory:");
        for (Coffee a :
                listOfItem.getList()) {
            System.out.println(a + " :  " + Collections.frequency(shopList.getCoffeeShop(), a));
        }
        System.out.println("Shop money: " + money);
    }

    /**
     * the shop is filled with coffee to a certain value with a small margin of error
     *
     * @param _moneyForBuy the maximum amount of money you can buy coffee
     * @param kg           the maximum number of kg of coffee you can buy
     * @return
     */
    //FIXME
    @Override
    public boolean buy(double _moneyForBuy, double kg) {
        boolean _check = true;
        double _tempMoney = 0;
        double _tempKg = 0;
        if (money < _moneyForBuy) {
            System.out.println("you dont have money");
            return false;
        } else {
            while (_check) { //
                for (Coffee c :
                        listOfItem.getList()) {
                    if ((_tempMoney + c.getPrice() <= _moneyForBuy)
                            && (_tempKg + c.getWeight() < kg)) {
                        _tempMoney += c.getPrice();
                        _tempKg += c.getWeight();
                        shopList.getCoffeeShop().add(c);
                    } else {
                        _check = false;
                    }
                }
            }
            System.out.println("the store spent money buying: "+_tempMoney + "$, it took " + _tempKg + "KG");
            money -= _tempMoney;
            return true;
        }
    }

    /**
     * a method for selling coffee to a customer
     *
     * @param userTaste search for coffee tastes
     * @param userType  search for coffee by its type
     */


    public static boolean sellCoffee(String userTaste, String userType) {
        if (employeeList.searchBarista()) {
            for (Coffee c :
                    shopList.getCoffeeShop()) {
                if ((c.getTaste().equals(userTaste))
                        && (c.getType().equals(userType))) {
                    money += c.getPrice();
                    shopList.getShopSales().add(c);
                    shopList.getCoffeeShop().remove(c);
                    return true;
                }
            }
        } else {
            System.out.println("\nSorry, there's no barista available at the moment.");
        }
        return false;
    }

    public static void sellDrink(Drink drink) {
        money += drink.getPrice();
        shopList.getDrinkSales().add(drink);
    }

    public void salesRevenue() {
        int tempRevenue = 0;
        for (Coffee c :
                shopList.getShopSales()) {
            tempRevenue += c.getPrice();
        }
        for (Drink d :
                shopList.getDrinkSales()) {
            tempRevenue += d.getPrice();
        }
        System.out.println("\nSales revenue: " + tempRevenue);
    }

    public static void clientCoffeeSetPrice(Coffee coffee) {
        for (Coffee c :
                shopList.getCoffeeShop()) {
            if (c.getTaste().equals(coffee.getTaste())
                    && c.getType().equals(coffee.getType())) {
                coffee.setPrice(c.getPrice());
            }
        }
    }

    public boolean searchCoffee(double from, double to) {
        int counter = 0;
        System.out.println("\nFind: ");
        for (Coffee c :
                shopList.getCoffeeShop()) {
            if (c.getPrice() >= from && c.getPrice() <= to) {
                System.out.println(c);
                counter++;
            }
        }
        return counter >= 1;
    }

    public boolean searchCoffee(String taste) {
        int counter = 0;
        for (Coffee c :
                shopList.getCoffeeShop()) {
            if (c.getTaste().equals(taste)) {
                System.out.println(c);
                counter++;
            }
        }
        return counter >= 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shop)) return false;
        Shop shop = (Shop) o;
        return listOfItem.equals(shop.listOfItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfItem);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
