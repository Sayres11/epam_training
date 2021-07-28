package com.epam.jwd.client;

import com.epam.jwd.entity.Coffee;
import com.epam.jwd.entity.Drink;
import com.epam.jwd.storage.ClientList;
import com.epam.jwd.shop.Shop;

public class Client implements ClientInterface {
    private final String name;
    private double money;
    private double basketPrice;

    ClientList clientList = new ClientList(this);

    public Client(String name, double money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public void buy() {
        int sum = 0;
        if(this.money >= basketPrice )
        for (int j = 0; j < clientList.getClientBasket().size(); j++) {
            if (Shop.sellCoffee(clientList.getClientBasket().get(j).getTaste()
                    , clientList.getClientBasket().get(j).getType())) {
                if (sum + clientList.getClientBasket().get(j).getPrice() < money) {
                    sum += clientList.getClientBasket().get(j).getPrice();
                    clientList.getClientPurchases().add(clientList.getClientBasket().get(j));
                    basketPrice -= clientList.getClientBasket().get(j).getPrice();
                    clientList.getClientBasket().remove(j--);
                }
            }
        }
        money -= sum;
        System.out.println("\nClient: " + name + " money left: " + money + " Purchases:");
        for (int i = 0; i < clientList.getClientPurchases().size(); i++) {
            System.out.println(clientList.getClientPurchases().get(i));
        }
    }

    public void buyDrink(Drink drink) {
        if (money >= drink.getPrice()) {
            Shop.sellDrink(drink);
            money -= drink.getPrice();
            System.out.println(this.name + " buy " + drink + "for " + drink.getPrice());
        } else {
            System.out.println("you dont have money for buy " + drink);
        }
    }

    public void printMoney(){
        System.out.println(name + " "+ money);
    }

    @Override
    public void add(Coffee coffee) {
        Shop.clientCoffeeSetPrice(coffee);
        basketPrice+= coffee.getPrice();
        clientList.getClientBasket().add(coffee);
    }


    public String toString() {
        return "Name: " + name + ", Money: " + money;
    }
}
