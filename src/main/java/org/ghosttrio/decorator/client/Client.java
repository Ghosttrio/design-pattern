package org.ghosttrio.decorator.client;

import org.ghosttrio.decorator.component.Coffee;
import org.ghosttrio.decorator.concreteDecorator.MilkDecorator;
import org.ghosttrio.decorator.concreteDecorator.SugarDecorator;
import org.ghosttrio.decorator.concretecomponent.SimpleCoffee;

public class Client {

    private static final Coffee coffee = new SimpleCoffee();

    public static void main(String[] args) {

        System.out.println(coffee.getDescription() + ", " + coffee.cost());
        Coffee coffee1 = new MilkDecorator(coffee);
        System.out.println(coffee1.getDescription() + ", " + coffee1.cost());
        Coffee coffee2 = new SugarDecorator(coffee);
        System.out.println(coffee2.getDescription() + ", " + coffee2.cost());
    }
}
