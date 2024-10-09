package org.ghosttrio.mediator.client;

import org.ghosttrio.mediator.concretecolleague.Button;
import org.ghosttrio.mediator.concretecolleague.TextBox;
import org.ghosttrio.mediator.concretemediator.ConcreteMediator;
import org.ghosttrio.mediator.mediator.Mediator;

public class Client {
    public static void main(String[] args) {
        Button button = new Button(null);
        TextBox textBox = new TextBox(null);

        Mediator mediator = new ConcreteMediator(button, textBox);
        button.mediator = mediator;
        textBox.mediator = mediator;

        button.click();
    }
}
