/**
 * #4：二维数组中的查找
 * @author pYq
 *
 */

public class Solution04 {
	//Brute Force
	//163ms 16484k
	public boolean Find(int target, int[][] array) {
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j] == target)
					return true;
				if(array[i][j] > target)
					break;
			}
		}
		return false;
	}
	
	//from Bottom Left Moving
	//194ms 16496k
	/*
	 **从左下角或右上角开始查找 每次可排除一行或一列
	 **时间复杂度O(n) 空间复杂度O(1)
	 */
    public boolean Find2(int target, int [][] array) {
		int row = array.length;
		int column = array[0].length;
		
		for(int i = row - 1, j = 0; i >= 0 && j <column;) {
			if(array[i][j] == target)
				return true;
			else if(array[i][j] > target)
				i --;
			else
				j ++;
		}
		
		return false;
    }
    
    public static void main(String[] args) {
		int target = 7;
		int[][] array = {{1, 2, 8, 9},
						 {2, 4, 9, 12},
						 {4, 7, 10, 13},
						 {6, 8, 11, 15}
						};
		
		long t = System.currentTimeMillis();		
		boolean ans = new Solution04().Find2(target, array);		
		t = System.currentTimeMillis() - t;
		
		System.out.println(t);
		System.out.println(ans);
	}
    
}


