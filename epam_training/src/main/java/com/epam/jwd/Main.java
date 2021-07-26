package com.epam.jwd;

import com.epam.jwd.client.Client;
import com.epam.jwd.consturctor.InstantCoffee;
import com.epam.jwd.list.ListOfCoffee;
import com.epam.jwd.shop.Shop;
import com.epam.jwd.consturctor.RoastCoffee;

public class Main {

    /**
     * Main method of the programme. Creates 2 objects: shop and client and sets property values for them
     *
     * @param args
     */
    public static void main(String[] args) {
        ListOfCoffee listOfCoffee = ListOfCoffee.getInstanceListOfItem();

        Shop shop = new Shop(2000);
        Client client = new Client("Pavel", 80);

        listOfCoffee.allCoffee.add(new RoastCoffee("Vanilla", 2, 2, "Glass"));
        listOfCoffee.allCoffee.add(new RoastCoffee("Chocolate", 10, 90, "Glass"));
        listOfCoffee.allCoffee.add(new InstantCoffee("Classic", 5, 8));
        listOfCoffee.allCoffee.add(new RoastCoffee("Vanilla2", 2, 2, "Glass"));
        listOfCoffee.allCoffee.add(new InstantCoffee("Blueberry", 8, 18));

        shop.buy(250, 50);
        shop.printAllCoffee();

        shop.add(new InstantCoffee("S", 2.0, 4.0));

        client.add(new InstantCoffee("Classic", 5, 10));
        client.add(new InstantCoffee("Vanilla", 25, 73));
        client.add(new InstantCoffee("Classic", 5, 10));
        client.add(new InstantCoffee("NULL", 5, 10));

        client.buy();
        shop.printAllCoffee();

        shop.searchCoffee(2, 8);
        shop.searchCoffee("Vanilla2");
    }
}
