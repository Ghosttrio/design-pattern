package org.ghosttrio.chainofresponsibility.concreteHandler;

import org.ghosttrio.chainofresponsibility.handler.Handler;

public class ConcreteHandlerA extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request < 10) {
            System.out.println("핸들러 A가 처리 " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
