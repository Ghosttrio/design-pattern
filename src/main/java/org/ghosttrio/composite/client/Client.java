package org.ghosttrio.composite.client;

import org.ghosttrio.composite.composite.CompositeGraphic;
import org.ghosttrio.composite.leaf.Circle;
import org.ghosttrio.composite.leaf.Square;

public class Client {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();

        CompositeGraphic compositeGraphic = new CompositeGraphic();
        compositeGraphic.add(circle);
        compositeGraphic.add(square);

        compositeGraphic.draw();
    }
}