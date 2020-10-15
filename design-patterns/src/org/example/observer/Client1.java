package org.example.observer;

/**
 * Created by Ethan on 2020/10/15 11:20
 */
public class Client1 {
    public static void main(String[] args) {
        ConcreteObservable1 observable = new ConcreteObservable1();

        ConcreteObserver1 obs1 = new ConcreteObserver1();
        ConcreteObserver1 obs2 = new ConcreteObserver1();
        ConcreteObserver1 obs3 = new ConcreteObserver1();

        observable.addObserver(obs1);
        observable.addObserver(obs2);
        observable.addObserver(obs3);

        observable.setState(722);

        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());

    }
}