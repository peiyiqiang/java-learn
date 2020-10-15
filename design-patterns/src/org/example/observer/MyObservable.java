package org.example.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ethan on 2020/10/15 11:14
 */
public class MyObservable {

    protected List<MyObserver> list = new ArrayList<MyObserver>();

    public void addObserver(MyObserver o) {
        list.add(o);
    }

    public void deleteObserver(MyObserver o) {
        list.remove(o);
    }

    public void notifyObservers() {
        for (MyObserver observer : list) {
            observer.update(this);

        }
    }

}
