package org.ghosttrio.decorator.concreteDecorator;

import org.ghosttrio.decorator.component.Coffee;
import org.ghosttrio.decorator.decorator.CoffeeDecorator;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 500.0;
    }
}
