package com.epa.jwd.shop;

import com.epam.jwd.consturctor.Coffee;


public interface ShopInterface<T extends Coffee> {

    void add(T t);

    void printAllCoffee();

    boolean buy(double _moneyForBuy, double kg);
}
