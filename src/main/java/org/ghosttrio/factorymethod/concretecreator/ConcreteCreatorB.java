package org.ghosttrio.factorymethod.concretecreator;

import org.ghosttrio.factorymethod.concreteproduct.ConcreteProductB;
import org.ghosttrio.factorymethod.creator.Creator;
import org.ghosttrio.factorymethod.product.Product;

public class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
