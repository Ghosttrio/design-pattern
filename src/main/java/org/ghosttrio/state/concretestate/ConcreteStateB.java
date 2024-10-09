package org.ghosttrio.state.concretestate;

import org.ghosttrio.state.context.Context;
import org.ghosttrio.state.state.State;

public class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("state b : handling request");
        context.setState(new ConcreteStateA());
    }
}
