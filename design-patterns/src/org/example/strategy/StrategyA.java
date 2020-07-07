package org.example.strategy;

/**
 * Created by peiyiqiang on 2020/6/23.
 * Description:
 */
public class StrategyA implements Strategy {
    @Override
    public void info() {
        System.out.println("StrategyA.info");
    }
}
