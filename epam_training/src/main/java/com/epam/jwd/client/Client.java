package com.epam.jwd.client;

import com.epam.jwd.consturctor.Coffee;
import com.epam.jwd.list.ClientList;
import com.epam.jwd.shop.Shop;

public class Client implements ClientInterface {
    private final String _name;
    private double _money;

    ClientList clientList = new ClientList(this);
    Shop shop;

    public Client(String _name, double _money) {
        this._name = _name;
        this._money = _money;
    }

    @Override
    public void buy() {
        int _sum = 0;
        for (int j = 0; j < clientList.ClientBasket.size(); j++) {
            if (shop.sellCoffee(clientList.ClientBasket.get(j).get_taste()
                    , clientList.ClientBasket.get(j).get_type())) {
                if (_sum + clientList.ClientBasket.get(j).get_price() < _money) {
                    _sum += clientList.ClientBasket.get(j).get_price();
                    clientList.ClientPurchases.add(clientList.ClientBasket.get(j));
                    clientList.ClientBasket.remove(j--);
                }
            }
        }
        _money -= _sum;
        System.out.println("\nClient: " + _name + " money left: " + _money + " Purchases:");
        for (int i = 0; i < clientList.ClientPurchases.size(); i++) {
            System.out.println(clientList.ClientPurchases.get(i));
        }
    }

    @Override
    public void add(Coffee coffee) {
        clientList.ClientBasket.add(coffee);
    }

    public String toString() {
        return "Name: " + _name + ", Money: " + _money;
    }
}
