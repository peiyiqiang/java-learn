package org.example.state;

/**
 * Created by Ethan on 2020/10/15 11:00
 */
public class ConcreteStateC implements State {

    @Override
    public void handle() {
        System.out.println("ConcreteStateC.handle()");
    }

}