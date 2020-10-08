package org.example.bridge;

/**
 * Created by Ethan on 2020/10/08 14:42
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void doSomething() {
        System.out.println("ConcreteImplementorB.doSomething");
    }
}
