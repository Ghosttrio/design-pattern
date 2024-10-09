package org.ghosttrio.flyweight.flyweightfactory;

import org.ghosttrio.flyweight.concreteflyweight.OakTree;
import org.ghosttrio.flyweight.flyweight.TreeType;

import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {

    public final Map<String, TreeType> typeTypes = new HashMap<>();

    public TreeType getTreeType(String color) {
        TreeType treeType = typeTypes.get(color);

        if (treeType == null) {
            treeType = new OakTree(color);
            typeTypes.put(color, treeType);
            System.out.println("create oak tree color : " + color);
        }
        return treeType;
    }
}
