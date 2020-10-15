package org.example.memento;

/**
 * Created by Ethan on 2020/10/15 14:29
 */
public class Client {
    public static void main(String[] args) {
        CareTaker taker = new CareTaker();

        Originator o = new Originator("originator1", 7);
        System.out.println("name: " + o.getName() + ", age: " + o.getAge());

        taker.setMemento(o.memento());

        o.setName("originator2");
        o.setAge(22);
        System.out.println("name: " + o.getName() + ", age: " + o.getAge());

        o.recovery(taker.getMemento());
        System.out.println("name: " + o.getName() + ", age: " + o.getAge());

    }
}