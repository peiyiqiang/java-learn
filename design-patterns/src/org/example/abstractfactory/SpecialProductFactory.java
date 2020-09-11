package org.example.abstractfactory;

public class SpecialProductFactory implements ProductFactory {

	@Override
	public ProductA createProductA() {
		return new SpecialProductA();
	}

	@Override
	public ProductB createProductB() {
		return new SpecialProductB();
	}

	@Override
	public ProductC createProductC() {
		return new SpecialProductC();
	}

}
