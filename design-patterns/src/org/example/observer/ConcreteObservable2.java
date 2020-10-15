package org.example.observer;

import java.util.Observable;

/**
 * Created by Ethan on 2020/10/15 11:25
 * 目标对象
 */
public class ConcreteObservable2 extends Observable {

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;

        //Observable.setChanged(); ---- Marks this Observable object as having been changed
        setChanged();
        notifyObservers(state);
    }

}
