package org.ghosttrio.adapter.client;

import org.ghosttrio.adapter.adaptee.Turkey;
import org.ghosttrio.adapter.adapter.TurkeyAdapter;
import org.ghosttrio.adapter.target.Duck;

public class Client {

    public static void main(String[] args) {
        Turkey wildTurkey = new Turkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println();

        System.out.println("The Duck says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
