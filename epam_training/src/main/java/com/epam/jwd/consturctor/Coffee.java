package com.epam.jwd.consturctor;

/**
 * The abstract class Coffee are designed to provide basic functionality to the derived classes
 *
 * @author Aliaksei Karabelnikau
 * @version 16
 */
public abstract class Coffee {

    private final String _taste;
    private String _type;
    private final double _price;
    private final double _weight;

    /**
     * Constructor - create a new object(Coffee) with defined values
     *
     * @see InstantCoffee#InstantCoffee
     * @see RoastCoffee#RoastCoffee
     */
    public Coffee(String _taste, double _weight, double _price) {
        this._taste = _taste;
        this._weight = _weight;
        this._price = _price;
    }

    /**
     * Function to get the value of the {@link Coffee#_taste} field
     *
     * @return returns the taste of coffee
     */
    public String get_taste() {
        return _taste;
    }

    /**
     * Function to get the value of the {@link Coffee#_type} field
     *
     * @return returns the type of coffee
     */
    public String get_type() {
        return _type;
    }

    /**
     * Function to get the value of the {@link Coffee#_price} field
     *
     * @return returns the price of coffee
     */
    public double get_price() {
        return _price;
    }

    /**
     * Function to get the value of the {@link Coffee#_weight} field
     *
     * @return returns the weight of coffee
     */
    public double get_weight() {
        return _weight;
    }

    /**
     * Sets the value of the _type property
     */
    public void set_type(String t) {
        _type = t;
    }

    public String toString() {
        return _type + ", " + _taste + " flavoured coffee, " + _weight + "KG" + " coast:" + _price + "$";
    }
}
