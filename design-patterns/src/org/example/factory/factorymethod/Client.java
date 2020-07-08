package org.example.factory.factorymethod;

/**
 * Created by peiyiqiang on 2020/7/8.
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Product product1 = new ProductAFactory().createProduct();
        Product product2 = new ProductBFactory().createProduct();

        product1.info();
        product2.info();
    }
}
