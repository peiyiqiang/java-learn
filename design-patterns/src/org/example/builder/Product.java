package org.example.builder;

public class Product {
	private ComponentA componentA;
	private ComponentB componentB;
	private ComponentC componentC;
	
	public void showInfo() {
		System.out.println("Builder Test");
	}
	
	public ComponentA getComponentA() {
		return componentA;
	}
	public void setComponentA(ComponentA componentA) {
		this.componentA = componentA;
	}
	public ComponentB getComponentB() {
		return componentB;
	}
	public void setComponentB(ComponentB componentB) {
		this.componentB = componentB;
	}
	public ComponentC getComponentC() {
		return componentC;
	}
	public void setComponentC(ComponentC componentC) {
		this.componentC = componentC;
	}
	
}

class ComponentA {
	private String name;

	public ComponentA(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class ComponentB {
	private String name;

	public ComponentB(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class ComponentC {
	private String name;

	public ComponentC(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}