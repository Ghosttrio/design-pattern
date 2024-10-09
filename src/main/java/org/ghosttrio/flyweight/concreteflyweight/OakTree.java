package org.ghosttrio.flyweight.concreteflyweight;

import org.ghosttrio.flyweight.flyweight.TreeType;

public class OakTree implements TreeType {

    private final String color;

    public OakTree(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("x : " + x + ", y : " + y + ", color : " + color);
    }
}
