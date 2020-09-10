package org.example.singleton;

/**
 * 单例模式 静态内部类实现
 * 线程安全 效率高 延时加载
 *
 * @author pYq
 */
public class Singleton04 {
	
	private static class SingletonClassInstance {
		private static final Singleton04 instance = new Singleton04();
	}
	
	private Singleton04() {
	}
	
	public static Singleton04 getInstance() {
		return SingletonClassInstance.instance;
	}

}
