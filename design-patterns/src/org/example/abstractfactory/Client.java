package org.example.abstractfactory;

public class Client {
	public static void main(String[] args) {
		ProductFactory factory1 = new SpecialProductFactory();
		ProductFactory factory2 = new GeneralProductFactory();
		
		ProductA pa = factory1.createProductA();
		ProductB pb = factory2.createProductB();
		
		pa.showAInfo();
		pb.showBInfo();
	}

}
