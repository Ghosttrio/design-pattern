package org.ghosttrio.abstractfactory.implfactory;

import org.ghosttrio.abstractfactory.abstractfactory.GUIFactory;
import org.ghosttrio.abstractfactory.abstractproduct.Button;
import org.ghosttrio.abstractfactory.abstractproduct.TextBox;
import org.ghosttrio.abstractfactory.productimpl.LinuxButton;
import org.ghosttrio.abstractfactory.productimpl.LinuxTextBox;

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