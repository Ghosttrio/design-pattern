package org.ghosttrio.builder.client;

import org.ghosttrio.builder.builder.PizzaBuilder;
import org.ghosttrio.builder.product.Pizza;

public class Client {

    public static void main(String[] args) {
        Pizza large = new PizzaBuilder("Large")
                .witCheese(true)
                .withPepperoni(true)
                .build();
        System.out.println(large);
    }
}
