package com.epam.jwd.storage;

import com.epam.jwd.entity.Coffee;
import com.epam.jwd.entity.Drink;

import java.util.ArrayList;
import java.util.List;

public class ShopList {
    private final List<Coffee> coffeeShop = new ArrayList<>();
    private final ArrayList<Coffee> shopSales = new ArrayList<>();
    private final List<Drink> drinkSales = new ArrayList<>();

    public List<Coffee> getCoffeeShop() {
        return coffeeShop;
    }

    public List<Coffee> getShopSales() {
        return shopSales;
    }

    public List<Drink> getDrinkSales() {
        return drinkSales;
    }
}
