package org.ghosttrio.proxy.client;

import org.ghosttrio.proxy.proxy.ProxyImage;
import org.ghosttrio.proxy.subject.Image;

public class Client {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("img1");
        Image img2 = new ProxyImage("img2");

        img1.display();
        System.out.println();

        img1.display();
        System.out.println();

        img2.display();
    }
}
