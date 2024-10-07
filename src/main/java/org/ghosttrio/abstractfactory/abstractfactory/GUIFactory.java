package org.ghosttrio.abstractfactory.abstractfactory;

import org.ghosttrio.abstractfactory.abstractproduct.Button;
import org.ghosttrio.abstractfactory.abstractproduct.TextBox;

public interface GUIFactory {
    Button createButton();
    TextBox createTextBox();
}
