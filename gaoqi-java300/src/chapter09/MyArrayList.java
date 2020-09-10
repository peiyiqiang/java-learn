package chapter09;

public class MyArrayList<E> {
	
	Object[] elementData;
	private int size;
	
	private static final int DEFAULT_CAPACITY = 10;
	
	public MyArrayList() {
		elementData = new Object[DEFAULT_CAPACITY];
	}
	
	public MyArrayList(int capacity) {
		elementData = new Object[capacity];
	}
	
	public void add(E element) {
		elementData[size++] = element;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		for(Object obj: elementData) {
			if(obj == null)
				break;
			sb.append(obj).append(",");
		}
		sb.setCharAt(sb.length() - 1, ']');
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		MyArrayList<String> mal = new MyArrayList<>(20);
		
		mal.add("aa");
		mal.add("bb");
		mal.add("cc");
		
		System.out.println(mal);
	}

}
