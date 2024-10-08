package org.ghosttrio.chainofresponsibility.concreteHandler;

import org.ghosttrio.chainofresponsibility.handler.Handler;

public class ConcreteHandlerB extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request < 20) {
            System.out.println("핸들러 B가 처리 " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
