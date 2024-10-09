package org.ghosttrio.memento.originator;

import org.ghosttrio.memento.memento.Memento;

public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("state set : " + state);
    }

    public String getState() {
        return state;
    }

    public Memento saveToMemento() {
        return new Memento(state);
    }

    public void restoreFromMemento(Memento memento) {
        state = memento.getState();
        System.out.println("state restore : " + state);
    }
}
