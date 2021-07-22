package com.epam.jwd.client;

import com.epam.jwd.consturctor.Coffee;
import com.epam.jwd.list.ClientList;
import com.epam.jwd.list.ListOfItem;

import java.util.ArrayList;

public class Client implements ClientInterface {
    private final String _name;
    private double _money;

    ClientList clientList = new ClientList(this);
    ListOfItem listOfItem = ListOfItem.getInstanceListOfItem();

    public Client(String _name, double _money) {
        this._name = _name;
        this._money = _money;
    }

    @Override
    public void buy() {
        int _sum = 0;
        for (int j = 0; j < clientList.ClientBasket.size(); j++) {
                if (_sum + clientList.ClientBasket.get(j)._price < _money) {
                    _sum += clientList.ClientBasket.get(j)._price;
                    clientList.ClientPurchases.add(clientList.ClientBasket.get(j));
                    clientList.ClientBasket.remove(j--);
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
/*    public boolean compare(ArrayList o1, ArrayList o2) {
        for (int i = 0; i < o1.size(); i++) {
            for (int j = 0; j <o2.size(); j++) {
                if(o1.get(i).equals(o2.get(j))){
                    return true;
                }
            }
        }
        return false;
    }*/
}
