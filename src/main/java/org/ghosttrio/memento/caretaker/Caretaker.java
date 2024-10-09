package org.ghosttrio.memento.caretaker;

import org.ghosttrio.memento.memento.Memento;
import org.ghosttrio.memento.originator.Originator;

public class Caretaker {

    private Memento memento;

    public void save(Originator originator) {
        memento = originator.saveToMemento();
    }

    public void restore(Originator originator) {
        originator.restoreFromMemento(memento);
    }
}
