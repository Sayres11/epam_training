package com.epam.jwd.consturctor;

public class InstantCoffee extends Coffee {

    public InstantCoffee(String _taste, double _weight, double _price) {
        super(_taste, _weight, _price);
        _type = "Instant/Blend";
    }

}

