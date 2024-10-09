package org.ghosttrio.visitor.visitor;

import org.ghosttrio.visitor.concreteelement.ElementA;
import org.ghosttrio.visitor.concreteelement.ElementB;

public interface Visitor {
    void visit(ElementA elementA);
    void visit(ElementB elementB);
}
