package com.epam.jwd.client;

import com.epam.jwd.consturctor.Coffee;

public interface ClientInterface<T extends Coffee> {

    void buy();

    void add(T t);
}
