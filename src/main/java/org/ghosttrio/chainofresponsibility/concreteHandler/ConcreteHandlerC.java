package org.ghosttrio.chainofresponsibility.concreteHandler;

import org.ghosttrio.chainofresponsibility.handler.Handler;

public class ConcreteHandlerC extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request < 30) {
            System.out.println("핸들러 C가 처리 " + request);
        } else {
            System.out.println("모든 핸들러가 처리 못함");
        }
    }
}
