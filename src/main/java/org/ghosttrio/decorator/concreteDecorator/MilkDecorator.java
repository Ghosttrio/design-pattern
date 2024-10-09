package org.ghosttrio.decorator.concreteDecorator;

import org.ghosttrio.decorator.component.Coffee;
import org.ghosttrio.decorator.decorator.CoffeeDecorator;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 300.0;
    }
}
