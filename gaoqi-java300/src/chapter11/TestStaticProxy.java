package chapter11;

/**
 * *静态代理设计模式
 * *公共接口
 * *真实角色
 * *代理角色
 * @author pYq
 *
 */
public class TestStaticProxy {
	public static void main(String[] args) {
		RealRole realRole = new RealRole();
		new ProxyRole(realRole).testProxy();
		//MyThread myThread = new MyThread();
		//new Thread(myThread).start();
	}

}

//公共接口
interface ProxyInterface {
	void testProxy();
}

//真实角色
class RealRole implements ProxyInterface {

	@Override
	public void testProxy() {
		System.out.println("RealRole.testProxy()");
	}

}

//代理角色
class ProxyRole implements ProxyInterface {
	//目标真实角色
	private ProxyInterface target;

	public ProxyRole(ProxyInterface target) {
		this.target = target;
	}

	@Override
	public void testProxy() {
		before();
		this.target.testProxy();
		after();
	}

	private void before() {
		System.out.println("ProxyRole.before()");
	}

	private void after() {
		System.out.println("ProxyRole.after()");
	}

}
