package org.ghosttrio.visitor.objectstructure;

import org.ghosttrio.visitor.element.Element;
import org.ghosttrio.visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private List<Element> elements = new ArrayList<>();

    public void addElement(Element element) {
        elements.add(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
