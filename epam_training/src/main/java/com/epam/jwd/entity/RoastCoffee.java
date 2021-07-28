package com.epam.jwd.entity;

import java.util.Objects;

public class RoastCoffee extends Coffee {
    private final String _pack;

    public RoastCoffee(String _taste, double _weight, double _price, String _pack) {
        super(_taste, _weight, _price);
        this._pack = _pack;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoastCoffee)) return false;
        if (!super.equals(o)) return false;
        RoastCoffee that = (RoastCoffee) o;
        return _pack.equals(that._pack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), _pack);
    }

    public String toString() {
        return _pack + ", " + getType() + " " + getTaste() + " flavoured coffee, " + getWeight() + "KG" + " coast:" + getPrice() + "$";
    }
}
