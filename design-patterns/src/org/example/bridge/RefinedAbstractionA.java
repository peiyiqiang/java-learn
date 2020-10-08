package org.example.bridge;

/**
 * Created by Ethan on 2020/10/08 14:36
 */
public class RefinedAbstractionA extends Abstraction {

    public RefinedAbstractionA(Implementor imp) {
        super(imp);
    }

    @Override
    public void request() {
        super.request();
        System.out.println("RefinedAbstractionA.request");
    }
}
