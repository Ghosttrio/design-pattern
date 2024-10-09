package org.ghosttrio.mediator.concretemediator;

import org.ghosttrio.mediator.colleague.Colleague;
import org.ghosttrio.mediator.concretecolleague.Button;
import org.ghosttrio.mediator.concretecolleague.TextBox;
import org.ghosttrio.mediator.mediator.Mediator;

public class ConcreteMediator implements Mediator {

    private Button button;
    private TextBox textBox;

    public ConcreteMediator(Button button, TextBox textBox) {
        this.button = button;
        this.textBox = textBox;
    }

    @Override
    public void notify(Colleague colleague, String event) {
        if (event.equals("click")) {
            textBox.update();
        }
    }
}
