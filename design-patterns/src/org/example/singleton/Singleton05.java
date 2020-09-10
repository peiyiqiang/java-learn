package org.example.singleton;

/**
 * 单例模式 枚举实现
 * 线程安全 效率高 延时加载
 * 可以防止反射和反序列化漏洞
 *
 * @author pYq
 */
public enum Singleton05 {
	
	//该枚举元素本身就是单例对象
	INSTANCE;
	
	public void singletonOperation() {
		//相应操作
	}
}
