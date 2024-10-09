package org.ghosttrio.composite.leaf;

import org.ghosttrio.composite.component.Graphic;

public class Circle implements Graphic {
    @Override
    public void draw() {
        System.out.println("원그리기");
    }
}
