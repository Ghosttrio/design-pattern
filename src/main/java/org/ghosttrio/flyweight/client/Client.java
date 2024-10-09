package org.ghosttrio.flyweight.client;

import org.ghosttrio.flyweight.flyweight.TreeType;
import org.ghosttrio.flyweight.flyweightfactory.TreeTypeFactory;

public class Client {
    public static void main(String[] args) {
        TreeTypeFactory treeTypeFactory = new TreeTypeFactory();
        TreeType tree1 = treeTypeFactory.getTreeType("Green");
        tree1.draw(10, 20);
        TreeType tree2 = treeTypeFactory.getTreeType("Brown");
        tree2.draw(30, 40);
        TreeType tree3 = treeTypeFactory.getTreeType("Green");
        tree3.draw(50, 60);

        System.out.println("Total tree types created: " + treeTypeFactory.typeTypes.size());
    }
}
