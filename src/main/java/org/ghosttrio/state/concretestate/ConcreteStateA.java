package org.ghosttrio.state.concretestate;

import org.ghosttrio.state.context.Context;
import org.ghosttrio.state.state.State;

public class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        System.out.println("state a : handling request");
        context.setState(new ConcreteStateB());
    }
}
