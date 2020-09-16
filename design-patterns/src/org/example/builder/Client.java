package org.example.builder;

public class Client {
	public static void main(String[] args) {
		ProductDirector director = new SpecialProductDirector(new SpecialProductBuilder());
		
		Product product = director.directorProduct();
		
		System.out.println("*************");
		System.out.println(product.getComponentA().getName());
		product.showInfo();
	}
}
