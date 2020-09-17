package org.example.adapter;

/**
 * *适配器（对象适配器方式，使用了组合的方式跟被适配对象整合）
 * @author pYq
 *
 */
public class Adapter02  implements Target {
	
	private Adaptee adaptee;
	
	public Adapter02(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void handleReq() {
		adaptee.request();
	}
}
