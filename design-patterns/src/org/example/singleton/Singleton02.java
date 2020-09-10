package org.example.singleton;

import java.io.Serializable;

/**
 * 单例模式 懒汉式
 * 线程安全 效率低 延时加载
 * 
 * 1.构造器私有化
 * 2.私有静态属性 存储对象地址
 * 3.公共静态属性 获取对象
 *
 * @author pYq
 */
public class Singleton02 implements Serializable {
	
	//单例对象延迟加载lazy load，真正用的时候再创建，资源利用率高
	private static Singleton02 instance;
	
	private Singleton02() {
	}
	
	//方法同步，调用效率低
	public static synchronized Singleton02 getInstance() {
		if(instance == null)
			instance = new Singleton02();
		return instance;
	}

}