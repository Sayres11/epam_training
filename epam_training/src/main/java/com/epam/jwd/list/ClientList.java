package com.epam.jwd.list;

import com.epam.jwd.client.Client;
import com.epam.jwd.consturctor.Coffee;

import java.util.ArrayList;

public class ClientList {
    public ArrayList<Coffee> ClientBasket = new ArrayList<>();

    public ArrayList<Coffee> ClientPurchases = new ArrayList<>();

    public ClientList(Client client) {
    }
}
