package org.ghosttrio.builder.builder;

import org.ghosttrio.builder.product.Pizza;

public class PizzaBuilder {
    private final String size;
    private boolean cheese;
    private boolean pepperoni;

    public PizzaBuilder(String size) {
        this.size = size;
    }

    public PizzaBuilder witCheese(boolean cheese) {
        this.cheese = cheese;
        return this;
    }

    public PizzaBuilder withPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
        return this;
    }

    public Pizza build() {
        return new Pizza(this);
    }

    public String getSize() {
        return size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }
}
