package chapter05;

public interface MyInterface {
	
	int TEST = 722;
	
	void test();

}

class TestInterface implements MyInterface {
	public void test() {
		System.out.println("TestInterface.test()");
	}
}
