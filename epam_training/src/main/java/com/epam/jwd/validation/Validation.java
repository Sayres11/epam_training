package com.epam.jwd.validation;

/**
 * Exception when transmitting zero or negative value
 */
public class Validation {
    public static void validation(Double _price, Double _weight)
            throws IllegalArgumentException {

        if (_price <= 0) {
            throw new IllegalArgumentException("Illegal argument 'price' = " + _price);
        }

        if (_weight <= 0) {
            throw new IllegalArgumentException("Illegal argument 'Weight' = " + _weight);
        }
    }
}
