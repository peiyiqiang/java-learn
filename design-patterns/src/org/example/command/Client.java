package org.example.command;

/**
 * Created by Ethan on 2020/10/14 20:30
 */
public class Client {
    public static void main(String[] args) {
        Command c = new ConcreteCommand(new Receiver());

        Invoke i = new Invoke(c);

        i.call();
    }
}