package org.example.chainofresponsibility;

/**
 * Created by Ethan on 2020/10/14 15:32
 */
public class HandlerC extends Handler {

    public HandlerC(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getLevel() < 10) {
            System.out.println("name:" + request.getName() + ", level:" + request.getLevel());
            System.out.println("C:request accepted");
            System.out.println();
        } else {
            if(this.nextHandler != null) {
                this.nextHandler.handleRequest(request);
            } else {
                System.out.println("name:" + request.getName() + ", level:" + request.getLevel());
                System.out.println("C:I can't handle this request");
                System.out.println();
            }
        }
    }
}