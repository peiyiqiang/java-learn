package org.example.abstractfactory;

public class GeneralProductFactory implements ProductFactory {

	@Override
	public ProductA createProductA() {
		return new GeneralProductA();
	}

	@Override
	public ProductB createProductB() {
		return new GeneralProductB();
	}

	@Override
	public ProductC createProductC() {
		return new GeneralProductC();
	}

}