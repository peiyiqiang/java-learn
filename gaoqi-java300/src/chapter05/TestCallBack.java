package chapter05;

public class TestCallBack {
	public void callBack(MyInterface f) {
		f.test();
	}
	
	public static void main(String[] args) {
		TestCallBack tcb = new TestCallBack();
		MyCallBack t = new MyCallBack();
		tcb.callBack(t);
	}

}

class MyCallBack implements MyInterface {

	@Override
	public void test() {
		System.out.println("MyCallBack.test()");
		
	}
	
}
