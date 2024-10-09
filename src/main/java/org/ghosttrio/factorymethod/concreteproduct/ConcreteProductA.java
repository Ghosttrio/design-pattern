package org.ghosttrio.factorymethod.concreteproduct;

import org.ghosttrio.factorymethod.product.Product;

public class ConcreteProductA implements Product {
    @Override
    public void use() {
        System.out.println("product a use");
    }
}
