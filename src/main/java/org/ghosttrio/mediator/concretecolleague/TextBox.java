package org.ghosttrio.mediator.concretecolleague;

import org.ghosttrio.mediator.colleague.Colleague;
import org.ghosttrio.mediator.mediator.Mediator;

public class TextBox extends Colleague {
    public TextBox(Mediator mediator) {
        super(mediator);
    }

    public void update() {
        System.out.println("update");
    }
}
