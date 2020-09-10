package org.example.singleton;

/**
 * 单例模式 饿汉式
 * 线程安全 效率高 无延时加载
 *
 * 1.构造器私有化
 * 2.私有静态属性 存储对象地址
 * 3.公共静态属性 获取对象
 *
 * @author pYq
 */
public class Singleton01 {
	
	//类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然是线程安全的
	private static Singleton01 instance = new Singleton01(); 
	
	private Singleton01() {
	}
	
	//方法不需要同步，调用效率高
	public static Singleton01 getInstance() {
		return instance;
	}

}