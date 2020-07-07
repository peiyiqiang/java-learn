package org.example.decorator;

public class Decorator implements Component {
	
	private Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public String getInfo() {
		return this.component.getInfo();
	}
	
}