package com.epam.jwd.shop;

import com.epam.jwd.entity.Coffee;


public interface ShopInterface {

    default void add(Coffee coffee) {

    }

    default void printAllCoffee() {

    }

    boolean buy(double _moneyForBuy, double kg);
}
