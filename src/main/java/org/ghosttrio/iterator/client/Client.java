package org.ghosttrio.iterator.client;

import org.ghosttrio.iterator.concreteaggregate.ConcreteAggregate;
import org.ghosttrio.iterator.iterator.Iterator;

public class Client {

    public static void main(String[] args) {
        ConcreteAggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.addItem("a");
        aggregate.addItem("b");
        aggregate.addItem("c");

        Iterator<String> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
