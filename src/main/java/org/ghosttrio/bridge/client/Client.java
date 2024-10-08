package org.ghosttrio.bridge.client;

import org.ghosttrio.bridge.abstraction.Shape;
import org.ghosttrio.bridge.concreteimplementor.Blue;
import org.ghosttrio.bridge.concreteimplementor.Red;
import org.ghosttrio.bridge.refinedabstraction.Circle;
import org.ghosttrio.bridge.refinedabstraction.Square;

public class Client {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red());
        Shape blueSquare = new Square(new Blue());

        System.out.println(redCircle.draw());
        System.out.println(blueSquare.draw());
    }
}
