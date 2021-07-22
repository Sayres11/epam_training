package com.epa.jwd.shop;

import com.epam.jwd.list.CoffeeShopList;
import com.epam.jwd.list.ListOfItem;
import com.epam.jwd.consturctor.Coffee;

import java.util.Collections;

public class Shop implements ShopInterface {
    private double _money;

    CoffeeShopList coffeeShopList = new CoffeeShopList();
    ListOfItem listOfItem1 = ListOfItem.getInstanceListOfItem();

    public Shop(double _money) {
        this._money = _money;
    }

    @Override
    public void add(Coffee coffee) {
        coffeeShopList.CoffeeShop.add(coffee);
    }

    @Override
    public void printAllCoffee() {
        for (Coffee a :
                listOfItem1.getList()) {
            System.out.println(a + " :  " + Collections.frequency(coffeeShopList.CoffeeShop, a));
        }
    }

    @Override
    public boolean buy(double _moneyForBuy, double kg) {
        boolean _check = true;
        double _tempMoney = 0;
        double _tempKg = 0;
        if (_money < _moneyForBuy) {
            System.out.println("you dont have money");
            return false;
        } else {
            while (_check) {
                for (Coffee c :
                        listOfItem1.getList()) {
                    if (_tempMoney + c._price <= _moneyForBuy && _tempKg + c._weight < kg) {
                        _tempMoney += c._price;
                        _tempKg += c._weight;
                        coffeeShopList.CoffeeShop.add(c);
                    } else {
                        _check = false;
                    }
                }
            }
            System.out.println(_tempMoney + "tmp " + _tempKg + "kg");
            _money -= _tempMoney;
            System.out.println(_money);
        }
        return true;
    }

    public String toString() {
        return "Money: " + _money;
    }
}
