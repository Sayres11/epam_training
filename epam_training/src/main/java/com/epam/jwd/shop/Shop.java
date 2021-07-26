package com.epam.jwd.shop;

import com.epam.jwd.list.ShopList;
import com.epam.jwd.list.ListOfCoffee;
import com.epam.jwd.consturctor.Coffee;

import java.util.Collections;

/**
 * shop class with properties <b>_money</b>
 */
public class Shop implements ShopInterface {
    private static double _money;

    static ShopList shopList = new ShopList();
    ListOfCoffee listOfItem = ListOfCoffee.getInstanceListOfItem();

    //Constructor - creating a new object
    public Shop(double _money) {
        Shop._money = _money;
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
        System.out.println("Shop money: " + _money);
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

        if (_money < _moneyForBuy) {
            System.out.println("you dont have money");
            return false;
        } else {
            while (_check) { //
                for (Coffee c :
                        listOfItem.getList()) {
                    if ((_tempMoney + c.get_price() <= _moneyForBuy)
                            && (_tempKg + c.get_weight() < kg)) {
                        _tempMoney += c.get_price();
                        _tempKg += c.get_weight();
                        this.shopList.CoffeeShop.add(c);
                    } else {
                        _check = false;
                    }
                }
            }
            System.out.println(_tempMoney + "tmp " + _tempKg + "kg");
            _money -= _tempMoney;
            System.out.println(_money);
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
            if ((c.get_taste().equals(userTaste))
                    && (c.get_type().equals(userType))) {
                _money += c.get_price();
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
            if (c.get_price() >= from && c.get_price() <= to) {
                System.out.println(c);
                counter++;
            }
        }
        return counter >= 1;
    }

    public static boolean searchCoffee(String taste) {
        int counter = 0;
        for (Coffee c :
                shopList.CoffeeShop) {
            if (c.get_taste().equals(taste)) {
                System.out.println(c);
                counter++;
            }
        }
        return counter >= 1;
    }

    public String toString() {
        return "Money: " + _money;
    }
}
