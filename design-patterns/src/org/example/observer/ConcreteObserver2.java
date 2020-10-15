package org.example.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Ethan on 2020/10/15 11:28
 */
public class ConcreteObserver2 implements Observer {

    private int myState;

    @Override
    public void update(Observable o, Object arg) {
        myState = ((ConcreteObservable2) o).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }

}