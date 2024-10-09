package org.ghosttrio.facade.client;

import org.ghosttrio.facade.facade.ComputerFacade;

public class Client {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.startComputer();
    }
}
