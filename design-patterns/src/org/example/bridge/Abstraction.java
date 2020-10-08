package org.example.bridge;

/**
 * Created by Ethan on 2020/10/08 14:30
 */
public abstract class Abstraction {

    private Implementor imp;

    public Abstraction(Implementor imp) {
        this.imp = imp;
    }

    public Implementor getImp() {
        return imp;
    }

    public void request() {
        this.imp.doSomething();
    }
}
