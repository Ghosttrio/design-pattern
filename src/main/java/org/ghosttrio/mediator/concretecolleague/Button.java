package org.ghosttrio.mediator.concretecolleague;

import org.ghosttrio.mediator.colleague.Colleague;
import org.ghosttrio.mediator.mediator.Mediator;

public class Button extends Colleague {

    public Button(Mediator mediator) {
        super(mediator);
    }

    public void click() {
        System.out.println("click");
        mediator.notify(this, "click");
    }
}
