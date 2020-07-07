package org.example.strategy;

/**
 * Created by peiyiqiang on 2020/6/23.
 * Description:
 */
public class Context {

    private Strategy strategy;

    //注入方法一：
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //注入方法二：
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void getInfo() {
        strategy.info();
    }
}
