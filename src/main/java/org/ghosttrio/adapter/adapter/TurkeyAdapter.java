package org.ghosttrio.adapter.adapter;

import org.ghosttrio.adapter.adaptee.Turkey;
import org.ghosttrio.adapter.target.Duck;

public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
