package com.epam.jwd.consturctor;

import java.util.Collection;

public abstract class Coffee {
    public final String _taste;
    public String _type;
    public final double _price;
    public final double _weight;


    public Coffee(String _taste, double _weight, double _price) {
        this._taste = _taste;
        this._weight = _weight;
        this._price = _price;
    }

    public String toString() {
        return _type + " " + _taste + " flavoured coffee, " + " coast:" + _price + "$";
    }
}
