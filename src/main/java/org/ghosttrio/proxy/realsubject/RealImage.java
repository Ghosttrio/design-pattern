package org.ghosttrio.proxy.realsubject;

import org.ghosttrio.proxy.subject.Image;

public class RealImage implements Image {

    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("loading " + filename);
    }

    @Override
    public void display() {
        System.out.println("display : " + filename);
    }
}
