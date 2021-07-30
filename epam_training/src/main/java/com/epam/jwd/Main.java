package com.epam.jwd;

import com.epam.jwd.client.Client;
import com.epam.jwd.entity.Coffee;
import com.epam.jwd.entity.CoffeePack;
import com.epam.jwd.entity.CoffeeType;
import com.epam.jwd.entity.Drink;
import com.epam.jwd.entity.Employee;
import com.epam.jwd.entity.Job;
import com.epam.jwd.shop.Shop;
import com.epam.jwd.storage.CoffeeList;
import com.epam.jwd.storage.EmployeeList;

public class Main {

    /**
     * Main method of the programme. Creates 2 objects: shop and client and sets property values for them
     *
     * @param args
     */
    public static void main(String[] args) {
        final CoffeeList coffeeList = CoffeeList.getInstanceListOfItem();
        final EmployeeList employeeList = EmployeeList.getInstance();

        Shop shop = new Shop(2000);

        employeeList.getEmployees().add(new Employee("Tomas", "McKing", 19, 1000, Job.Barista));

        coffeeList.getList().add(new Coffee("Vanilla", 2, 2, CoffeePack.GLASS, CoffeeType.RoastCoffee));
        coffeeList.getList().add(new Coffee("Vanilla", 2, 2, CoffeePack.CARTON, CoffeeType.InstantCoffee));
        coffeeList.getList().add(new Coffee("Blueberry", 4, 6, CoffeePack.GLASS, CoffeeType.RoastCoffee));
        coffeeList.getList().add(new Coffee("Chocolate", 1, 3, CoffeePack.CARTON, CoffeeType.InstantCoffee));
        coffeeList.getList().add(new Coffee("Vanilla", 2, 2, CoffeePack.GLASS, CoffeeType.RoastCoffee));
        coffeeList.getList().add(new Coffee("Vanilla", 2, 2, CoffeePack.CARTON, CoffeeType.InstantCoffee));

        shop.buy(250, 50);
        shop.printAllCoffee();

        Client client = new Client("Pavel", 60);

        client.buy();

        client.buyDrink(Drink.AMERICANO);
        shop.printAllCoffee();
        shop.salesRevenue();

        //shop.searchCoffee(2, 8);
        //shop.searchCoffee("Vanilla");
        client.printMoney();
    }
}
