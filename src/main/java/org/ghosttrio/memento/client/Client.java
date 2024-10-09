package org.ghosttrio.memento.client;

import org.ghosttrio.memento.caretaker.Caretaker;
import org.ghosttrio.memento.originator.Originator;

public class Client {

    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("state1");
        caretaker.save(originator);

        originator.setState("state2");
        caretaker.restore(originator);

        System.out.println("current state" + originator.getState());
    }
}
