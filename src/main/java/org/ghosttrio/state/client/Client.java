package org.ghosttrio.state.client;

import org.ghosttrio.state.concretestate.ConcreteStateA;
import org.ghosttrio.state.context.Context;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
        context.request();
    }
}
