package org.example.observer;

/**
 * Created by Ethan on 2020/10/15 11:29
 */
public class Client2 {
    public static void main(String[] args) {
        ConcreteObservable2 observable = new ConcreteObservable2();

        ConcreteObserver2 obs1 = new ConcreteObserver2();
        ConcreteObserver2 obs2 = new ConcreteObserver2();
        ConcreteObserver2 obs3 = new ConcreteObserver2();

        observable.addObserver(obs1);
        observable.addObserver(obs2);
        observable.addObserver(obs3);

        observable.setState(722);

        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());

    }
}