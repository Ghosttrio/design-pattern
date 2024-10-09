package org.ghosttrio.templatemethod.client;

import org.ghosttrio.templatemethod.abstractclass.AbstractClass;
import org.ghosttrio.templatemethod.concreteclass.ConcreteClassA;
import org.ghosttrio.templatemethod.concreteclass.ConcreteClassB;

public class Client {
    public static void main(String[] args) {
        AbstractClass classA = new ConcreteClassA();
        classA.templateMethod();
        System.out.println();

        AbstractClass classB = new ConcreteClassB();
        classB.templateMethod();
    }
}
