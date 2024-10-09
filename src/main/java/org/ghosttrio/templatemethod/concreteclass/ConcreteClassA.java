package org.ghosttrio.templatemethod.concreteclass;

import org.ghosttrio.templatemethod.abstractclass.AbstractClass;

public class ConcreteClassA extends AbstractClass {
    @Override
    protected void step2() {
        System.out.println("step 2 : a");
    }
}
