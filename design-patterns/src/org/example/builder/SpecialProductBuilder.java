package org.example.builder;

/**
 * 构建者实现类
 */
public class SpecialProductBuilder implements ProductBuilder {

	@Override
	public ComponentA builderComponentA() {
		System.out.println("Building Component A of Special Product");
		return new ComponentA("Component A of Special Product");
	}

	@Override
	public ComponentB builderComponentB() {
		System.out.println("Building Component B of Special Product");
		return new ComponentB("Component B of Special Product");
	}

	@Override
	public ComponentC builderComponentC() {
		System.out.println("Building Component C of Special Product");
		return new ComponentC("Component C of Special Product");
	}
}