package org.ghosttrio.visitor.element;

import org.ghosttrio.visitor.visitor.Visitor;

public interface Element {
    void accept(Visitor visitor);
}
