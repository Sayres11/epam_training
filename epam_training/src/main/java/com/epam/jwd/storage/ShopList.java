package com.epam.jwd.storage;

import com.epam.jwd.entity.Coffee;
import com.epam.jwd.entity.Drink;

import java.util.ArrayList;

public class ShopList {
    private final ArrayList<Coffee> coffeeShop = new ArrayList<>();

    public ArrayList<Coffee> getCoffeeShop() {
        return coffeeShop;
    }

    private final ArrayList<Coffee> shopSales = new ArrayList<>();

    public ArrayList<Coffee> getShopSales() {
        return shopSales;
    }
    private final ArrayList<Drink> drinkSales = new ArrayList<>();

    public ArrayList<Drink> getDrinkSales() {
        return drinkSales;
    }
}
