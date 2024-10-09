package org.ghosttrio.factorymethod.client;

import org.ghosttrio.factorymethod.concretecreator.ConcreteCreatorA;
import org.ghosttrio.factorymethod.concretecreator.ConcreteCreatorB;
import org.ghosttrio.factorymethod.creator.Creator;
import org.ghosttrio.factorymethod.product.Product;

public class Client {

    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.factoryMethod();
        productA.use();
        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.factoryMethod();
        productB.use();
    }
}
