package org.ghosttrio.abstractfactory.concretefactory;

import org.ghosttrio.abstractfactory.abstractfactory.GUIFactory;
import org.ghosttrio.abstractfactory.abstractproduct.Button;
import org.ghosttrio.abstractfactory.abstractproduct.TextBox;
import org.ghosttrio.abstractfactory.concreteproduct.LinuxButton;
import org.ghosttrio.abstractfactory.concreteproduct.LinuxTextBox;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextBox createTextBox() {
        return new LinuxTextBox();
    }
}