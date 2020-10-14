package org.example.chainofresponsibility;

/**
 * Created by Ethan on 2020/10/14 15:33
 */
public class Client {
    public static void main(String[] args) {
        Handler h1 = new HandlerA("Handler A");
        Handler h2 = new HandlerB("Handler B");
        Handler h3 = new HandlerC("Handler C");

        h1.setNextHandler(h2);
        h2.setNextHandler(h3);

        Request request1 = new Request("req 1", 2);
        Request request2 = new Request("req 2", 6);
        Request request3 = new Request("req 3", 9);
        Request request4 = new Request("req 4", 12);

        h1.handleRequest(request1);
        h1.handleRequest(request2);
        h1.handleRequest(request3);
        h1.handleRequest(request4);
    }

}
