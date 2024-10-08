package org.ghosttrio.abstractfactory.concretefactory;

import org.ghosttrio.abstractfactory.abstractfactory.GUIFactory;
import org.ghosttrio.abstractfactory.abstractproduct.Button;
import org.ghosttrio.abstractfactory.abstractproduct.TextBox;
import org.ghosttrio.abstractfactory.concreteproduct.WindowsButton;
import org.ghosttrio.abstractfactory.concreteproduct.WindowsTextBox;

public class WindowFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WindowsTextBox();
    }
}
