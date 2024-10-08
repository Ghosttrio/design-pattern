package org.ghosttrio.bridge.abstraction;

import org.ghosttrio.bridge.implementor.Color;

public abstract class Shape {

    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    public abstract String draw();
}
