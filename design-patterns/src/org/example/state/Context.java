package org.example.state;

/**
 * Created by Ethan on 2020/10/15 11:00
 */
public class Context {

    private State state;

    public void setState(State state) {
        System.out.println("Change State");
        this.state = state;
        this.state.handle();
    }

}