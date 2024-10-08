package org.ghosttrio.abstractfactory.concreteproduct;

import org.ghosttrio.abstractfactory.abstractproduct.Button;

public class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("리눅스 버튼 paint");
    }
}
