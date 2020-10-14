package org.example.strategy;

/**
 * Created by peiyiqiang on 2020/6/23.
 * Description:负责和具体的策略类交互，具体的算法和客户端的调用分离了，使得算法可以独立于客户端独立的变化。
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

    //注入方法三：Spring依赖注入

    public void getInfo() {
        strategy.info();
    }
}
