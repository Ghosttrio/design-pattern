package org.ghosttrio.mediator.colleague;

import org.ghosttrio.mediator.mediator.Mediator;

public abstract class Colleague {
    public Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
