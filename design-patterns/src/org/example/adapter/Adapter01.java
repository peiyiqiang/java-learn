package org.example.adapter;

/**
 * *适配器（类适配器方式）
 * @author pYq
 *
 */
public class Adapter01 extends Adaptee implements Target {

	@Override
	public void handleReq() {
		super.request();
	}
}