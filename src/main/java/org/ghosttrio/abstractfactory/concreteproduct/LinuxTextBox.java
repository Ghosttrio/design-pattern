package org.ghosttrio.abstractfactory.concreteproduct;

import org.ghosttrio.abstractfactory.abstractproduct.TextBox;

public class LinuxTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("리눅스 텍스트 박스 render");
    }
}
