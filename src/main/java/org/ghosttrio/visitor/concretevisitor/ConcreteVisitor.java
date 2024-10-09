package org.ghosttrio.visitor.concretevisitor;

import org.ghosttrio.visitor.concreteelement.ElementA;
import org.ghosttrio.visitor.concreteelement.ElementB;
import org.ghosttrio.visitor.visitor.Visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ElementA elementA) {
        System.out.println("visit a: " + elementA.getData());
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("visit b: " + elementB.getData());
    }
}
