package com.epam.jwd;

import com.epam.jwd.client.Client;
import com.epam.jwd.entity.*;
import com.epam.jwd.storage.CoffeeList;
import com.epam.jwd.shop.Shop;
import com.epam.jwd.storage.EmployeeList;

public class Main {

    /**
     * Main method of the programme. Creates 2 objects: shop and client and sets property values for them
     *
     * @param args
     */
    public static void main(String[] args) {
        CoffeeList coffeeList = CoffeeList.getInstanceListOfItem();
        EmployeeList employeeList = EmployeeList.getInstance();

        Shop shop = new Shop(2000);

        employeeList.getEmployees().add(new Employee("Tomas", "McKing", 19, 1000, Job.Barista));

        coffeeList.getList().add(new RoastCoffee("Vanilla", 2, 2, "Glass"));
        coffeeList.getList().add(new RoastCoffee("Chocolate", 10, 90, "Glass"));
        coffeeList.getList().add(new InstantCoffee("Classic", 5, 8));
        coffeeList.getList().add(new RoastCoffee("Vanilla2", 2, 2, "Glass"));
        coffeeList.getList().add(new InstantCoffee("Blueberry", 8, 18));

        shop.buy(250, 50);
        shop.printAllCoffee();

        Client client = new Client("Pavel", 60);

        client.add(new InstantCoffee("Classic", 5));
        client.add(new InstantCoffee("Vanilla", 5));
        client.add(new InstantCoffee("Classic", 2));
        client.add(new InstantCoffee("NULL", 2));

        client.buy();

        client.buyDrink(Drink.AMERICANO);
        shop.printAllCoffee();
        shop.salesRevenue();

        //shop.searchCoffee(2, 8);
        //shop.searchCoffee("Vanilla");
        client.printMoney();
    }
}
