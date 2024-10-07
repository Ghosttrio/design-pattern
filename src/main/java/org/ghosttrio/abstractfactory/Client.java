package org.ghosttrio.abstractfactory;

import org.ghosttrio.abstractfactory.abstractfactory.GUIFactory;
import org.ghosttrio.abstractfactory.abstractproduct.Button;
import org.ghosttrio.abstractfactory.abstractproduct.TextBox;
import org.ghosttrio.abstractfactory.implfactory.LinuxFactory;
import org.ghosttrio.abstractfactory.implfactory.WindowFactory;

public class Client {

    private Button button;
    private TextBox textBox;

    public Client(GUIFactory factory) {
        this.button = factory.createButton();
        this.textBox = factory.createTextBox();
    }

    public void paint() {
        button.paint();
        textBox.render();
    }

    public static void main(String[] args) {
        GUIFactory factory;
        String os = "linux";
        if(os.equals("window")){
            factory = new WindowFactory();
        } else {
            factory = new LinuxFactory();
        }

        Client client = new Client(factory);
        client.paint();
    }
}
