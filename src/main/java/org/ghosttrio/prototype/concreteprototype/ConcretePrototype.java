package org.ghosttrio.prototype.concreteprototype;

import org.ghosttrio.prototype.prototype.Prototype;

public class ConcretePrototype implements Prototype {

    private String name;
    private int value;

    public ConcretePrototype(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(name, value);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
