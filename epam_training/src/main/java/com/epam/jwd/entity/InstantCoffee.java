package com.epam.jwd.entity;

/**
 * a class created from an abstract coffee class has only its method
 */
public class InstantCoffee extends Coffee {

    public InstantCoffee(String taste, double weight, double price) {
        super(taste, weight, price);
        setType("Instant/Blend");
    }

    public InstantCoffee(String taste, double weight) {
        super(taste, weight);
        setType("Instant/Blend");
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
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setType(String t) {
        super.setType(t);
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}

