package org.example.chainofresponsibility;

/**
 * Created by Ethan on 2020/10/14 15:32
 */
public class HandlerB extends Handler {

    public HandlerB(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getLevel() < 7) {
            System.out.println("name:" + request.getName() + ", level:" + request.getLevel());
            System.out.println("B:request accepted");
            System.out.println();
        } else {
            if(this.nextHandler != null) {
                this.nextHandler.handleRequest(request);
            } else {
                System.out.println("name:" + request.getName() + ", level:" + request.getLevel());
                System.out.println("B:I can't handle this request");
                System.out.println();
            }
        }
    }
}