package org.example.factory.simplefactory;

/**
 * Created by peiyiqiang on 2020/6/21.
 * Description:
 */
public class ProductFactory {

    public static Product createProduct(String type) {
        Product returnProduct = null;

        switch (type) {
            case "A":
                returnProduct =  new ProductA();
                break;
            case "B":
                returnProduct =  new ProductB();
                break;
        }

        return returnProduct;

    }
}
