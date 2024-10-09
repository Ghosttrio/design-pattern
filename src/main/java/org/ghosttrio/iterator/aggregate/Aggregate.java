package org.ghosttrio.iterator.aggregate;

import org.ghosttrio.iterator.iterator.Iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
