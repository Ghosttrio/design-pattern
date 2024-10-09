package org.ghosttrio.strategy.client;

import org.ghosttrio.strategy.concretestrategy.ConcreteStrategyAdd;
import org.ghosttrio.strategy.concretestrategy.ConcreteStrategySubtract;
import org.ghosttrio.strategy.context.Context;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyAdd());
        System.out.println(context.executeStrategy(1, 1));

        context.setStrategy(new ConcreteStrategySubtract());
        System.out.println(context.executeStrategy(1, 1));
    }
}
