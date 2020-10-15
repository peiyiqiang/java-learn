package org.example.state;

/**
 * Created by Ethan on 2020/10/15 11:00
 */
public class Client {
    public static void main(String[] args) {
        Context c = new Context();

        c.setState(new ConcreteStateA());
        c.setState(new ConcreteStateB());
        c.setState(new ConcreteStateC());
    }
}