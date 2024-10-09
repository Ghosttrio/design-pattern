package org.ghosttrio.composite.leaf;

import org.ghosttrio.composite.component.Graphic;

public class Square implements Graphic {
    @Override
    public void draw() {
        System.out.println("사각형그리기");
    }
}
