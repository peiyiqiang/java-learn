package chapter07;

import java.util.Arrays;

public class TestBubbleSort {
	public static void main(String[] args) {
		testBubbleSort();

	}

	public static void testBubbleSort() {
		/*
		 * 二分查找
		 */
		int[] a = new int[10];
		int temp;

		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 10);
		}

		System.out.println(Arrays.toString(a));

		for(int j = a.length - 1; j > 0; j--) {
			boolean existChange = false;
			for(int i = 0; i < j; i++) {
				if(a[i] > a[i+1]) {
					existChange = true;
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}

			}
			System.out.println(j);
			if(existChange == false)
				break;
		}
		System.out.println(Arrays.toString(a));
	}

}