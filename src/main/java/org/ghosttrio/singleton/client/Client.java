package org.ghosttrio.singleton.client;

import org.ghosttrio.singleton.singleton.Singleton;

public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}
