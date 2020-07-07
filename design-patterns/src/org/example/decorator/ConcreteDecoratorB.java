package org.example.decorator;

public class ConcreteDecoratorB extends Decorator {
	
	public ConcreteDecoratorB(Component component) {
		super(component);
	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + " with B";
	}
}