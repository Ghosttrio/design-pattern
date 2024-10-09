package org.ghosttrio.strategy.concretestrategy;

import org.ghosttrio.strategy.strategy.Strategy;

public class ConcreteStrategyAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
