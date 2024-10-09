package org.ghosttrio.proxy.proxy;

import org.ghosttrio.proxy.realsubject.RealImage;
import org.ghosttrio.proxy.subject.Image;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
