/*
package com.epam.jwd.entity;

import java.util.Objects;

public class RoastCoffee extends Coffee {

    public RoastCoffee(String taste, double weight, double price, CoffeePack coffeePack) {
        super(taste, weight, price, coffeePack);
        setType("Roast");
    }

    @Override
    public String getTaste() {
        return super.getTaste();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String t) {
        super.setType(t);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public CoffeePack getCoffeePack() {
        return super.getCoffeePack();
    }

    @Override
    public void setCoffeePack(CoffeePack coffeePack) {
        super.setCoffeePack(coffeePack);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoastCoffee)) return false;
        if (!super.equals(o)) return false;
        RoastCoffee that = (RoastCoffee) o;
        return getCoffeePack().equals(that.getCoffeePack());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCoffeePack());
    }

    public String toString() {
        return getCoffeePack() + ", " + getType() + " " + getTaste() + " flavoured coffee, " + getWeight() + "KG" + " coast:" + getPrice() + "$";
    }
}
*/
