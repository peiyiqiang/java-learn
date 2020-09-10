package org.example.singleton;

public class Client {
	public static void main(String[] args) {
		Singleton01 s1 = Singleton01.getInstance();
		Singleton01 s2 = Singleton01.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
		Singleton05 s3 = Singleton05.INSTANCE;
		Singleton05 s4 = Singleton05.INSTANCE;
		
		System.out.println(s3);
		System.out.println(s4);
	}

}