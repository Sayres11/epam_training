package com.epam.jwd.storage;

import com.epam.jwd.client.Client;
import com.epam.jwd.entity.Coffee;

import java.util.ArrayList;
import java.util.List;

/**
 * The class is used to store coffee objects with properties
 */
public class ClientList {

    /**
     * the customer can have any coffee in their basket, but they can only buy what is available in the shop
     */
    private final List<Coffee> ClientBasket = new ArrayList<>();
    /**
     * customer purchases in the shop
     */
    private final List<Coffee> ClientPurchases = new ArrayList<>();

    public ClientList(Client client) {
    }

    public List<Coffee> getClientBasket() {
        return ClientBasket;
    }

    public List<Coffee> getClientPurchases() {
        return ClientPurchases;
    }
}
