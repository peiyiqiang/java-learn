package org.example.chainofresponsibility;

/**
 * Created by Ethan on 2020/10/14 15:31
 * 抽象类
 */
public abstract class Handler {
    protected String name;
    //责任链上的后继对象
    protected Handler nextHandler;

    public Handler(String name) {
        this.name = name;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(Request request);
}
