package com.epam.jwd.entity;

/**
 * a class created from an abstract coffee class has only its method
 */
public class InstantCoffee extends Coffee {

    public InstantCoffee(String _taste, double _weight, double _price) {
        super(_taste, _weight, _price);
        set_type("Instant/Blend");
    }
}

