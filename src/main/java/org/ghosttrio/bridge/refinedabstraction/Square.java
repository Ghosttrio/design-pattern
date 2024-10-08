package org.ghosttrio.bridge.refinedabstraction;

import org.ghosttrio.bridge.abstraction.Shape;
import org.ghosttrio.bridge.implementor.Color;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "square color : " + color.fill();
    }
}