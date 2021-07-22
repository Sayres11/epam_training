package com.epam.jwd.list;

import com.epam.jwd.consturctor.Coffee;
import java.util.ArrayList;

public class ListOfItem {
    public static ListOfItem listOfItem;

    public ArrayList<Coffee> allCoffee = new ArrayList<>();


    public static ListOfItem getInstanceListOfItem() {
        if (listOfItem == null) {
            listOfItem = new ListOfItem();
        }
        return listOfItem;
    }

    public ArrayList<Coffee> getList() {
        return allCoffee;
    }

}
