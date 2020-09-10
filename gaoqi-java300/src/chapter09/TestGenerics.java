package chapter09;

public class TestGenerics {
	public static void main(String[] args) {
		//Without Generic
		MyCollection mc = new MyCollection();
		
		mc.set("test", 0);
		mc.set(722, 1);
		
		String s = (String) mc.get(0);
		int a = (int) mc.get(1);
		
		System.out.println(s);
		System.out.println(a);
		
		System.out.println("**************");
		
		//Use Generic
		MyCollection2<String> mc2 = new MyCollection2<>();
		
		mc2.set("test2", 0);
		//mc2.set(722, 1);  Wrong
		
		String s2 = mc2.get(0);
		//int a2 = (int) mc2.get(1);  Wrong
		
		System.out.println(s2);
		//System.out.println(a2);
		
		
	}

}

class MyCollection {
	Object[] objs = new Object[5];
	
	public void set(Object obj, int index) {
		objs[index] = obj;
	}
	
	public Object get(int index) {
		return objs[index];
	}
}

class MyCollection2<E> {
	Object[] objs = new Object[5];
	
	public void set(E e, int index) {
		objs[index] = e;
	}
	
	public E get(int index) {
		return (E)objs[index];
	}
}