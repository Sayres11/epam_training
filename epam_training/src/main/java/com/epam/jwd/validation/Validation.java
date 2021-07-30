package com.epam.jwd.validation;

/**
 * Exception when transmitting zero or negative value
 */
public class Validation {
    public static void validate(Double price, Double weight)
            throws IllegalArgumentException {

        if (price <= 0) {
            throw new IllegalArgumentException("Illegal argument 'price' = " + price);
        }

        if (weight <= 0) {
            throw new IllegalArgumentException("Illegal argument 'Weight' = " + weight);
        }
    }
}
