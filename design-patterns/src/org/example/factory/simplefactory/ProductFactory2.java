package org.example.factory.simplefactory;

/**
 * Created by peiyiqiang on 2020/6/21.
 * Description:
 */
public class ProductFactory2 {

    public static Product createProductA() {
        return new ProductA();
    }

    public static Product createProductB() {
        return new ProductB();
    }
}
