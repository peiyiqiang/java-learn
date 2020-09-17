package org.example.adapter;

public class Client {
	public void test(Target t) {
		t.handleReq();
	}
	
	public static void main(String[] args) {
		Client c = new Client();
		
		Target t1 = new Adapter01();
		c.test(t1);

		Adaptee a = new Adaptee();
		Target t2 = new Adapter02(a);
		c.test(t2);
	}
}