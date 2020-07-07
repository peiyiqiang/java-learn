package org.example.decorator;

/**
 * 装饰器模式
 * Component			抽象构件
 * ConcreteComponent	具体构件
 * Decorator			装饰角色
 * ConcreteDecorator	具体装饰角色
 * 
 * 应用：io中的buffered
 * 
 * @author Ethan 
 * 
 */

public class Client {
	public static void main(String[] args) {
		Component c = new ConcreteComponent();
		
		Component dA = new ConcreteDecoratorA(c);
		System.out.println(dA.getInfo());
		
		Component dB = new ConcreteDecoratorB(dA);
		System.out.println(dB.getInfo());
	}

}








