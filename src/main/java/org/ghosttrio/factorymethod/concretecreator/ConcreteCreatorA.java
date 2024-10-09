package org.ghosttrio.factorymethod.concretecreator;

import org.ghosttrio.factorymethod.concreteproduct.ConcreteProductA;
import org.ghosttrio.factorymethod.creator.Creator;
import org.ghosttrio.factorymethod.product.Product;

public class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
