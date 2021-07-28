package com.epam.jwd.storage;

import com.epam.jwd.client.Client;
import com.epam.jwd.entity.Coffee;
import com.epam.jwd.entity.Drink;

import java.util.ArrayList;

/**
 * The class is used to store coffee objects with properties
 */
public class ClientList {

    /**
     * the customer can have any coffee in their basket, but they can only buy what is available in the shop
     */
    private ArrayList<Coffee> ClientBasket = new ArrayList<>();

    public ArrayList<Coffee> getClientBasket() {
        return ClientBasket;
    }

    /**
     * customer purchases in the shop
     */
    private ArrayList<Coffee> ClientPurchases = new ArrayList<>();

    public ArrayList<Coffee> getClientPurchases() {
        return ClientPurchases;
    }

    public ClientList(Client client) {
    }
}
