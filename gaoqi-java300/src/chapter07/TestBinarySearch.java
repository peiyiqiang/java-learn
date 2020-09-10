package chapter07;

import java.util.Arrays;

public class TestBinarySearch {
	public static void main(String[] args) {
		int m = testBinarySearch();
		System.out.println(m);
	}
	
	public static int testBinarySearch() {
		int[] a = new int[10];
		int temp;
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 10);
		}
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));	
		
		int value = (int)(Math.random() * 10); 
		System.out.println(value);
		
		int low = 0;
		int high = a.length - 1;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			
			if(value == a[mid]) {
				return mid;
			}
			
			if(value < a[mid]) {
				System.out.println("high");
				high = mid - 1;
			}
			
			if(value > a[mid]) {
				System.out.println("low");
				low = mid + 1;
			}
			
		}
		return -1;		
	}

}

