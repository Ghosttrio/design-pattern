package org.ghosttrio.visitor.concreteelement;

import org.ghosttrio.visitor.element.Element;
import org.ghosttrio.visitor.visitor.Visitor;

public class ElementB implements Element {
    private String data;

    public ElementB(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
