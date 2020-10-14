package org.example.flyweight;

/**
 * Created by Ethan on 2020/10/14 14:40
 */
public class Client {
    public static void main(String[] args) {
        Flyweight fw1 = FlyweightFactory.getFlyweight("SharedState");
        Flyweight fw2 = FlyweightFactory.getFlyweight("SharedState");

        System.out.println(fw1);
        System.out.println(fw2);

        fw1.show(new UnsharedConcreteFlyWeight("UnsharedState1"));
        fw2.show(new UnsharedConcreteFlyWeight("UnsharedState2"));
    }

}