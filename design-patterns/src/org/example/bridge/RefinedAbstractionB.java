package org.example.bridge;

/**
 * Created by Ethan on 2020/10/08 14:39
 */
public class RefinedAbstractionB extends Abstraction {

    public RefinedAbstractionB(Implementor imp) {
        super(imp);
    }

    @Override
    public void request() {
        super.request();
        System.out.println("RefinedAbstractionB.request");
    }
}
