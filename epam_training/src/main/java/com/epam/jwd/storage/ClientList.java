package com.epam.jwd.storage;

import com.epam.jwd.client.Client;
import com.epam.jwd.entity.Coffee;

import java.util.ArrayList;

/**
 * The class is used to store coffee objects with properties
 */
public class ClientList {

    /**
     * the customer can have any coffee in their basket, but they can only buy what is available in the shop
     */
    public ArrayList<Coffee> ClientBasket = new ArrayList<>();

    /**
     * customer purchases in the shop
     */
    public ArrayList<Coffee> ClientPurchases = new ArrayList<>();

    public ClientList(Client client) {
    }
}
