package org.example.flyweight;

/**
 * Created by Ethan on 2020/10/14 14:27
 * 非共享享元类
 */
public class UnsharedConcreteFlyWeight {
    private String unsharedState;

    public UnsharedConcreteFlyWeight(String unsharedState) {
        this.unsharedState = unsharedState;
    }

    public String getUnsharedState() {
        return unsharedState;
    }

    public void setUnsharedState(String unsharedState) {
        this.unsharedState = unsharedState;
    }
}
