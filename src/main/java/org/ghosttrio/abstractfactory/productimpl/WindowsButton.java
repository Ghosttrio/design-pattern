package org.ghosttrio.abstractfactory.productimpl;

import org.ghosttrio.abstractfactory.abstractproduct.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("윈도우 버튼 paint");
    }
}
