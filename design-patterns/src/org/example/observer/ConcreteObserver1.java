package org.example.observer;

/**
 * Created by Ethan on 2020/10/15 11:19
 */
public class ConcreteObserver1 implements MyObserver {

    private int myState;

    @Override
    public void update(MyObservable o) {
        myState = ((ConcreteObservable1) o).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }

}
