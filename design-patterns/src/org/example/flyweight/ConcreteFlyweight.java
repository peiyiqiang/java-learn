package org.example.flyweight;

/**
 * Created by Ethan on 2020/10/14 14:30
 * 具体享元类
 */
public class ConcreteFlyweight implements Flyweight {
    private String sharedState;

    public ConcreteFlyweight(String sharedState) {
        this.sharedState = sharedState;
    }

    @Override
    public void show(UnsharedConcreteFlyWeight ucf) {
        System.out.println(sharedState + "----" + ucf.getUnsharedState());
    }

    public String getSharedState() {
        return sharedState;
    }

    public void setSharedState(String sharedState) {
        this.sharedState = sharedState;
    }
}
