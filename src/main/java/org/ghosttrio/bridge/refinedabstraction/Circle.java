package org.ghosttrio.bridge.refinedabstraction;

import org.ghosttrio.bridge.abstraction.Shape;
import org.ghosttrio.bridge.implementor.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "circle color : " + color.fill();
    }
}
