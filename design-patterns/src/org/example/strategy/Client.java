package org.example.strategy;

/**
 * Created by peiyiqiang on 2020/6/23.
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Context contextA = new Context(new StrategyA());
        Context contextB = new Context(new StrategyB());

        contextA.getInfo();
        contextB.getInfo();
    }
}
