package org.ghosttrio.command.client;

import org.ghosttrio.command.command.Command;
import org.ghosttrio.command.concretecommand.LightOffCommand;
import org.ghosttrio.command.concretecommand.LightOnCommand;
import org.ghosttrio.command.invoker.RemoteControl;
import org.ghosttrio.command.receiver.Light;

public class Client {

    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
