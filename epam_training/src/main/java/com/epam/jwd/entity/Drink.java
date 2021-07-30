package com.epam.jwd.entity;

public enum Drink {
    ESPRESSO("ESPRESSO", 3),
    LATTE("LATTE", 2),
    CAPPUCCINO("CAPPUCCINO ", 2),
    AMERICANO("AMERICANO", 4);

    private final String name;
    private final double price;

    Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
