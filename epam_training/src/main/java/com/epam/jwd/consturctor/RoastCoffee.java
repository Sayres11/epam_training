package com.epam.jwd.consturctor;

public class RoastCoffee extends Coffee {
    public final String _pack;

    public RoastCoffee(String _taste, double _weight, double _price, String _pack) {
        super(_taste, _weight, _price);
        this._pack = _pack;
        _type = "Roast";
    }

    public String toString() {
        return _pack + " " + _type + " " + _taste + " flavoured coffee, " + "coast:" + _price + "$";
    }

}
