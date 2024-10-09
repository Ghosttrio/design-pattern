package org.ghosttrio.observer.subject;

import org.ghosttrio.observer.observer.Observer;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
