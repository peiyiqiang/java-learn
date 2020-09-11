package org.example.factory.simplefactory;

/**
 * Created by peiyiqiang on 2020/6/21.
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Product a1 = ProductFactory.createProduct("A");
        Product b1 = ProductFactory.createProduct("B");

        Product a2 = ProductFactory2.createProductA();
        Product b2 = ProductFactory2.createProductB();

        a1.info();
        b1.info();
        a1.info();
        b2.info();
    }
}
