package org.ghosttrio.facade.facade;

import org.ghosttrio.facade.subsystem.Computer;
import org.ghosttrio.facade.subsystem.Keyboard;
import org.ghosttrio.facade.subsystem.Monitor;

public class ComputerFacade {

    private Computer computer;
    private Monitor monitor;
    private Keyboard keyboard;

    public ComputerFacade() {
        this.computer = new Computer();
        this.monitor = new Monitor();
        this.keyboard = new Keyboard();
    }

    public void startComputer() {
        keyboard.connect();
        monitor.turnOn();
        computer.start();
        System.out.println("ready");
    }
}
