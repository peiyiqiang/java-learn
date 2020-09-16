package org.example.builder;

/**
 * 装配者实现类
 */
public class SpecialProductDirector implements ProductDirector {
	
	private ProductBuilder builder;

	public SpecialProductDirector(ProductBuilder builder) {
		this.builder = builder;
	}

	@Override
	public Product directorProduct() {
		ComponentA ca = builder.builderComponentA();
		ComponentB cb = builder.builderComponentB();
		ComponentC cc = builder.builderComponentC();
		
		Product product = new Product();
		product.setComponentA(ca);
		product.setComponentB(cb);
		product.setComponentC(cc);
		
		return product;
	}
}