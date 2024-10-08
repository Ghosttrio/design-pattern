package org.ghosttrio.builder.product;

import org.ghosttrio.builder.builder.PizzaBuilder;

public class Pizza {
    private final String size;
    private final boolean cheese;
    private final boolean pepperoni;

    public Pizza(PizzaBuilder builder) {
        this.size = builder.getSize();
        this.cheese = builder.isCheese();
        this.pepperoni = builder.isPepperoni();
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                '}';
    }
}
