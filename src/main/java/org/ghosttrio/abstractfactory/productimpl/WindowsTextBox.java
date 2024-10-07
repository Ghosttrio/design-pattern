package org.ghosttrio.abstractfactory.productimpl;

import org.ghosttrio.abstractfactory.abstractproduct.TextBox;

public class WindowsTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("윈도우 텍스트박스 render");
    }
}
