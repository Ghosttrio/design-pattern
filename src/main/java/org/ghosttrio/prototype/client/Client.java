package org.ghosttrio.prototype.client;

import org.ghosttrio.prototype.concreteprototype.ConcretePrototype;
import org.ghosttrio.prototype.prototype.Prototype;

public class Client {

    public static void main(String[] args) {
        Prototype original = new ConcretePrototype("original", 10);
        Prototype cloned = original.clone();

        System.out.println("original : " + original);
        System.out.println("cloned : " + cloned);
    }
}
