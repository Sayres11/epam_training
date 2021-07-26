package com.epam.jwd.shop;

import com.epam.jwd.storage.ShopList;
import com.epam.jwd.storage.ListOfCoffee;
import com.epam.jwd.entity.Coffee;

import java.util.Collections;

/**
 * shop class with properties <b>_money</b>
 */
public class Shop implements ShopInterface {
    private static double money;

    static ShopList shopList = new ShopList();
    ListOfCoffee listOfItem = ListOfCoffee.getInstanceListOfItem();

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
        shopList.CoffeeShop.add(coffee);
    }

    @Override
    public void printAllCoffee() {
        listOfItem.allCoffee.sort(listOfItem::compareByPrice);
        System.out.println("\nShop inventory:");
        for (Coffee a :
                listOfItem.getList()) {
            System.out.println(a + " :  " + Collections.frequency(shopList.CoffeeShop, a));
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
                        shopList.CoffeeShop.add(c);
                    } else {
                        _check = false;
                    }
                }
            }
            System.out.println(_tempMoney + "tmp " + _tempKg + "kg");
            money -= _tempMoney;
            System.out.println(money);
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
        for (Coffee c :
                shopList.CoffeeShop) {
            if ((c.getTaste().equals(userTaste))
                    && (c.getType().equals(userType))) {
                money += c.getPrice();
                shopList.CoffeeShop.remove(c);
                return true;
            }
        }
        return false;
    }

    public boolean searchCoffee(double from, double to) {
        int counter = 0;
        System.out.println("\nFind: ");
        for (Coffee c :
                shopList.CoffeeShop) {
            if (c.getPrice() >= from && c.getPrice() <= to) {
                System.out.println(c);
                counter++;
            }
        }
        return counter >= 1;
    }

    public  boolean searchCoffee(String taste) {
        int counter = 0;
        for (Coffee c :
                shopList.CoffeeShop) {
            if (c.getTaste().equals(taste)) {
                System.out.println(c);
                counter++;
            }
        }
        return counter >= 1;
    }

    public String toString() {
        return "Money: " + money;
    }
}
