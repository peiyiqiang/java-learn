package chapter08;

public class TestWrapperClass {
	public static void main(String[] args) {

		Integer i1 = new Integer(722);

		//AutoBoxing
		Integer i2 = 722;  //Integer i2 = Integer.valueOf(722);

		//unBoxing
		int i3 = i1;  //int i3 = i1.intValue();

		//字符串转整数
		int i4 = Integer.parseInt("722");

		int a = 5;

		//整数转字符串
		String s1 = Integer.toString(722);

	}

	public static String getType(Object o) { //获取变量类型方法
		return o.getClass().toString(); //使用int类型的getClass()方法
	}
}