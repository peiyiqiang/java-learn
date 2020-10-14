package org.example.command;

/**
 * Created by Ethan on 2020/10/14 20:30
 */
public class Invoke {

    private Command command;

    public Invoke(Command command) {
        this.command = command;
    }

    public void call() {
        command.execute();
    }

}