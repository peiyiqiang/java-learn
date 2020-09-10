package chapter11;
/**
 * *单例设计模式
 * *构造器私有化
 * *提供私有的静态属性 存储对象的地址
 * *提供公共的静态方法 获取对象
 *
 * *懒汉式:类加载时不初始化实例,在第一次使用时再加载,即延时加载
 * @author pYq
 *
 */
public class TestSingleton {
	private static volatile TestSingleton singleton; //volatile 解决指令重排造成的问题

	private TestSingleton() {

	}

	public static TestSingleton getInstance() {
		//DCL double checked locking 解决线程不安全的问题
		if(singleton == null) {
			synchronized (TestSingleton.class) {
				if(singleton == null) {
					singleton = new TestSingleton();
				}
			}
		}
		return singleton;
	}

}

// 饿汉式:类加载时初始化相应实例
class TestSingleton2 {
	private static TestSingleton2 singleton = new TestSingleton2();

	private TestSingleton2() {

	}

	public static TestSingleton2 getInstance() {
		return singleton;
	}
}
