package org.ghosttrio.visitor.concreteelement;

import org.ghosttrio.visitor.element.Element;
import org.ghosttrio.visitor.visitor.Visitor;

public class ElementA implements Element {
    private String data;

    public ElementA(String data) {
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
