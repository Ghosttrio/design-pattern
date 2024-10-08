package org.ghosttrio.command.concretecommand;

import org.ghosttrio.command.command.Command;
import org.ghosttrio.command.receiver.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
