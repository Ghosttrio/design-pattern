package org.ghosttrio.templatemethod.abstractclass;

public abstract class AbstractClass {

    public final void templateMethod() {
        step1();
        step2();
        step3();
    }

    protected void step1() {
        System.out.println("step 1");
    }

    protected abstract void step2();

    protected void step3() {
        System.out.println("step 3");
    }
}
