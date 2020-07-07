package org.example.decorator;

public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + " with A";
	}
}