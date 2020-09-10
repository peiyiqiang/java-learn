package org.example.singleton;

/**
 * 单例模式 双重检测锁double checked locking(DCL)实现
 *
 * @author pYq
 */
public class Singleton03 {
	
	private static volatile Singleton03 instance;
	
	private Singleton03() {	
	}
	
	public static Singleton03 getInstance() {
		if(instance == null) {
			synchronized (Singleton03.class) {
				if(instance == null)
					instance = new  Singleton03();
			}
		}
		return instance;
	}

}