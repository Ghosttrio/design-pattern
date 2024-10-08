package org.ghosttrio.bridge.concreteimplementor;

import org.ghosttrio.bridge.implementor.Color;

public class Red implements Color {
    @Override
    public String fill() {
        return "red";
    }
}
