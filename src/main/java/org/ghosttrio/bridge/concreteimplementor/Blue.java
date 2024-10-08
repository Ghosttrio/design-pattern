package org.ghosttrio.bridge.concreteimplementor;

import org.ghosttrio.bridge.implementor.Color;

public class Blue implements Color {
    @Override
    public String fill() {
        return "blue";
    }
}
