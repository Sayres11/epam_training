package com.epam.jwd.consturctor;

public class RoastCoffee extends Coffee {
    private final String _pack;

    public RoastCoffee(String _taste, double _weight, double _price, String _pack) {
        super(_taste, _weight, _price);
        this._pack = _pack;
        set_type("Roast");
    }

    public String toString() {
        return _pack + ", " + get_type() + " " + get_taste() + " flavoured coffee, " + get_weight() + "KG" + " coast:" + get_price() + "$";
    }
}
