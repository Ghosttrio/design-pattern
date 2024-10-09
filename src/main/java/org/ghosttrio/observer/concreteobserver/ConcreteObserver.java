package org.ghosttrio.observer.concreteobserver;

import org.ghosttrio.observer.observer.Observer;

public class ConcreteObserver implements Observer {

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String state) {
        System.out.println(name + ", change state : " + state);
    }
}
