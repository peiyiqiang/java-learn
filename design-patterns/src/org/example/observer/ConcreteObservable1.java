package org.example.observer;

/**
 * Created by Ethan on 2020/10/15 11:17
 * 目标对象
 */
public class ConcreteObservable1 extends MyObservable {

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;

        notifyObservers();
    }

}