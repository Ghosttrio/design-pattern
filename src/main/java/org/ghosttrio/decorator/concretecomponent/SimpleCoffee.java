package org.ghosttrio.decorator.concretecomponent;

import org.ghosttrio.decorator.component.Coffee;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "simple coffee";
    }

    @Override
    public double cost() {
        return 100.0;
    }
}
