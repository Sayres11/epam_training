package com.epam.jwd.storage;

import com.epam.jwd.entity.Coffee;

import java.util.ArrayList;
import java.util.List;

/**
 * a class created to hold all the coffee that may not be in the shop
 */
public class CoffeeList {
    public static CoffeeList coffeeList;

    private final List<Coffee> allCoffee = new ArrayList<>();

    /**
     * To avoid creating a new instance of the class and always have access to one "List" use singleton
     */
    public static CoffeeList getInstanceListOfItem() {
        if (coffeeList == null) {
            coffeeList = new CoffeeList();
        }
        return coffeeList;
    }

    public List<Coffee> getList() {
        return allCoffee;
    }

    public int compareByPrice(Coffee o1, Coffee o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }

    public int compareByWeight(Coffee o1, Coffee o2) {
        return Double.compare(o1.getWeight(), o2.getWeight());
    }
}
