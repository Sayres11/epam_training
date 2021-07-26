package com.epam.jwd.entity;

import java.util.Objects;

/**
 * The abstract class Coffee are designed to provide basic functionality to the derived classes
 *
 * @author Aliaksei Karabelnikau
 * @version 16
 */
public abstract class Coffee {

    private final String taste;
    private String type;
    private final double price;
    private final double weight;

    /**
     * Constructor - create a new object(Coffee) with defined values
     *
     * @see InstantCoffee#InstantCoffee
     * @see RoastCoffee#RoastCoffee
     */
    public Coffee(String taste, double weight, double price) {
        this.taste = taste;
        this.weight = weight;
        this.price = price;
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
     * Function to get the value of the {@link Coffee#type} field
     *
     * @return returns the type of coffee
     */
    public String getType() {
        return this.type;
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

    /**
     * Sets the value of the _type property
     */
    public void setType(String t) {
        this.type = t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coffee)) return false;
        Coffee coffee = (Coffee) o;
        return Double.compare(coffee.getPrice(), getPrice()) == 0
                && Double.compare(coffee.getWeight(), getWeight()) == 0
                && getTaste().equals(coffee.getTaste())
                && getType().equals(coffee.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTaste(), getType(), getPrice(), getWeight());
    }

    @Override
    public String toString() {
        return this.type + ", " + this.taste + " flavoured coffee, " + this.weight + "KG" + " coast:" + this.price + "$";
    }
}
