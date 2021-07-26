package com.epam.jwd.client;

import com.epam.jwd.entity.Coffee;
import com.epam.jwd.storage.ClientList;
import com.epam.jwd.shop.Shop;

public class Client implements ClientInterface {
    private final String name;
    private double money;

    ClientList clientList = new ClientList(this);
    Shop shop;

    public Client(String name, double money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public void buy() {
        int sum = 0;
        for (int j = 0; j < clientList.ClientBasket.size(); j++) {
            if (shop.sellCoffee(clientList.ClientBasket.get(j).getTaste()
                    , clientList.ClientBasket.get(j).getType())) {
                if (sum + clientList.ClientBasket.get(j).getPrice() < money) {
                    sum += clientList.ClientBasket.get(j).getPrice();
                    clientList.ClientPurchases.add(clientList.ClientBasket.get(j));
                    clientList.ClientBasket.remove(j--);
                }
            }
        }
        money -= sum;
        System.out.println("\nClient: " + name + " money left: " + money + " Purchases:");
        for (int i = 0; i < clientList.ClientPurchases.size(); i++) {
            System.out.println(clientList.ClientPurchases.get(i));
        }
    }

    @Override
    public void add(Coffee coffee) {
        clientList.ClientBasket.add(coffee);
    }

    public String toString() {
        return "Name: " + name + ", Money: " + money;
    }
}
