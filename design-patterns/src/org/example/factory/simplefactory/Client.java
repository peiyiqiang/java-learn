package org.example.factory.simplefactory;

/**
 * Created by peiyiqiang on 2020/6/21.
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Product a = ProductFactory.createProduct("A");
        Product b = ProductFactory.createProduct("B");

        a.info();
        b.info();
    }
}
