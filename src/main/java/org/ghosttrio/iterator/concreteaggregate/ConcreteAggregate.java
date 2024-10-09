package org.ghosttrio.iterator.concreteaggregate;

import org.ghosttrio.iterator.aggregate.Aggregate;
import org.ghosttrio.iterator.concreteiterator.ConcreteIterator;
import org.ghosttrio.iterator.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<T> implements Aggregate<T> {

    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(items);
    }
}
