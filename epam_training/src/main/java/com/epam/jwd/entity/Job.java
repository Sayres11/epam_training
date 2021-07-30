package com.epam.jwd.entity;

public enum Job {
    Barista,
    Driver;

    public static Job getBarista() {
        return Barista;
    }

    public static Job getDriver() {
        return Driver;
    }
}
