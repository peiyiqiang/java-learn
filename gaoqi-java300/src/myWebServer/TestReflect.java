package myWebServer;

/**
 * Reflect:
 * 1.获取Class对象 三种方式
 * 2.创建对象 两种方式 JDK9推荐第二种
 * @author pYq
 *
 */
public class TestReflect {
	public static void main(String[] args) throws Exception {

		TestR t = new TestR();
		Class clz = t.getClass();

		clz = TestR.class;

		clz = Class.forName("myWebServer.TestR");


		TestR t2 = (TestR) clz.newInstance();
		t2.testr();

		t2 = (TestR) clz.getConstructor().newInstance();
		t2.testr();
	}

}

class TestR {
	public TestR() {
		System.out.println("TestR.TestR()");
	}

	public void testr() {
		System.out.println("TestR.testr()");
	}
}