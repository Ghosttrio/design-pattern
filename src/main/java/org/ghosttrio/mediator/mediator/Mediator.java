package org.ghosttrio.mediator.mediator;

import org.ghosttrio.mediator.colleague.Colleague;

public interface Mediator {
    void notify(Colleague colleague, String event);
}
