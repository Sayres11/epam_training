package com.epam.jwd;

import com.epam.jwd.client.Client;
import com.epam.jwd.consturctor.InstantCoffee;
import com.epam.jwd.list.ListOfItem;
import com.epa.jwd.shop.Shop;
import com.epam.jwd.consturctor.RoastCoffee;

public class Main {
    public static void main(String[] args) {
        ListOfItem listOfItem = ListOfItem.getInstanceListOfItem();

        Shop shop = new Shop(2000);
        Client client = new Client("Pavel", 80);

        listOfItem.allCoffee.add(new RoastCoffee("Vanilla", 2, 2, "Glass"));
        listOfItem.allCoffee.add(new RoastCoffee("Chocolate", 10, 90, "Glass"));
        listOfItem.allCoffee.add(new InstantCoffee("Classic", 5, 8));
        listOfItem.allCoffee.add(new InstantCoffee("Blueberry", 8, 18));

        shop.buy(250, 50);
        shop.printAllCoffee();

        client.add(new InstantCoffee("Classic", 5, 10));
        client.add(new InstantCoffee("Vanilla", 25, 73));
        client.add(new InstantCoffee("Classic", 5, 10));
        client.add(new InstantCoffee("Blueberry", 8, 18));

        client.buy();
    }
}
