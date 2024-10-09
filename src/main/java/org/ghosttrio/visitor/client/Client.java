package org.ghosttrio.visitor.client;

import org.ghosttrio.visitor.concreteelement.ElementA;
import org.ghosttrio.visitor.concreteelement.ElementB;
import org.ghosttrio.visitor.concretevisitor.ConcreteVisitor;
import org.ghosttrio.visitor.objectstructure.ObjectStructure;
import org.ghosttrio.visitor.visitor.Visitor;

public class Client {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.addElement(new ElementA("a1"));
        structure.addElement(new ElementB("b1"));

        Visitor visitor = new ConcreteVisitor();
        structure.accept(visitor);
    }
}
