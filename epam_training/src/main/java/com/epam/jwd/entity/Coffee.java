package com.epam.jwd.entity;

import java.util.Objects;

/**
 * The abstract class Coffee are designed to provide basic functionality to the derived classes
 *
 * @author Aliaksei Karabelnikau
 * @version 16
 */
public class Coffee {

    private final String taste;
    private double price;
    private final double weight;

    private CoffeePack coffeePack;
    private CoffeeType coffeeType;

    public Coffee(String taste, double weight, double price, CoffeePack coffeePack,CoffeeType coffeeType) {
        this.taste = taste;
        this.weight = weight;
        this.price = price;
        this.coffeePack = coffeePack;
        this.coffeeType = coffeeType;
    }

    public Coffee(String taste, double weight) {
        this.taste = taste;
        this.weight = weight;
    }


    /**
     * Function to get the value of the {@link Coffee#taste} field
     *
     * @return returns the taste of coffee
     */
    public String getTaste() {
        return this.taste;
    }

    /**
     * Function to get the value of the {@link Coffee#coffeeType} field
     *
     * @return returns the type of coffee
     */

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    /**
     * Function to get the value of the {@link Coffee#price} field
     *
     * @return returns the price of coffee
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Function to get the value of the {@link Coffee#weight} field
     *
     * @return returns the weight of coffee
     */
    public double getWeight() {
        return this.weight;
    }

    public CoffeePack getCoffeePack() {
        return coffeePack;
    }

    /**
     * Sets the value of the _type property
     */
    public void setType(CoffeeType t) {
        this.coffeeType = t;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCoffeePack(CoffeePack coffeePack) {
        this.coffeePack = coffeePack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coffee)) return false;
        Coffee coffee = (Coffee) o;
        return Double.compare(coffee.getPrice(), getPrice()) == 0
                && Double.compare(coffee.getWeight(), getWeight()) == 0
                && getTaste().equals(coffee.getTaste())
                && getCoffeeType().equals(coffee.getCoffeeType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTaste(), getCoffeeType(), getPrice(), getWeight());
    }

    @Override
    public String toString() {
        return this.coffeePack + ", " + this.coffeeType + ", " + this.taste + " flavoured coffee, " + this.weight + "KG" + " coast:" + this.price + "$";
    }
}
