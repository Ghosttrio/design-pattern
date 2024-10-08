package org.ghosttrio.chainofresponsibility.client;

import org.ghosttrio.chainofresponsibility.concreteHandler.ConcreteHandlerA;
import org.ghosttrio.chainofresponsibility.concreteHandler.ConcreteHandlerB;
import org.ghosttrio.chainofresponsibility.concreteHandler.ConcreteHandlerC;
import org.ghosttrio.chainofresponsibility.handler.Handler;

public class Client {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        // 핸들러 연결
        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);

        // 요청 처리
        int[] requests = {5, 15, 25, 35};

        for (int request : requests) {
            handlerA.handleRequest(request);
        }
    }
}
