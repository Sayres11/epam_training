package com.epam.jwd.storage;

import com.epam.jwd.entity.Coffee;

import java.util.ArrayList;

/**
 * a class created to hold all the coffee that may not be in the shop
 */
public class ListOfCoffee {
    public static ListOfCoffee listOfCoffee;

    public ArrayList<Coffee> allCoffee = new ArrayList<>();

    /**
     * To avoid creating a new instance of the class and always have access to one "List" use singleton
     */
    public static ListOfCoffee getInstanceListOfItem() {
        if (listOfCoffee == null) {
            listOfCoffee = new ListOfCoffee();
        }
        return listOfCoffee;
    }

    public ArrayList<Coffee> getList() {
        return allCoffee;
    }

    public int compareByPrice(Coffee o1, Coffee o2) {
        return ((Double) o1.get_price()).compareTo(o2.get_price());
    }

    public int compareByWeight(Coffee o1, Coffee o2) {
        return ((Double) o1.get_weight()).compareTo(o2.get_weight());
    }
}
