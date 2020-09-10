package org.example.singleton;

import java.io.Serializable;

/**
 * 单例模式 懒汉式（防止反射和反序列化漏洞）
 *
 * @author pYq
 */
public class Singleton02v2 implements Serializable {
	
	private static Singleton02v2 instance;
	
	private Singleton02v2() {
		synchronized (Singleton02v2.class) {
			if (instance == null) {
				instance = this;
			} else {
				throw new RuntimeException("单例模式被破坏");
			}
		}
	}
	
	public static synchronized Singleton02v2 getInstance() {
		if(instance == null)
			instance = new Singleton02v2();
		return instance;
	}
	
	//防止反序列化漏洞
	private Object readResolve() {
		return instance;
	}

}