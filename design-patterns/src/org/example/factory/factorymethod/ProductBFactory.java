package org.example.factory.factorymethod;

/**
 * Created by peiyiqiang on 2020/7/8.
 * Description:
 */
public class ProductBFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
