package org.ghosttrio.observer.client;

import org.ghosttrio.observer.concreteobserver.ConcreteObserver;
import org.ghosttrio.observer.concretesubject.ConcreteSubject;
import org.ghosttrio.observer.observer.Observer;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        subject.attach(observer1);
        subject.attach(observer2);

        subject.setSubject("state1");
        subject.setSubject("state2");

    }
}
