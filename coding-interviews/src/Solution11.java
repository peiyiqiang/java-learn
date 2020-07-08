//import java.util.ArrayList;
/**
 * #11:旋转数组的最小数字
 * @author pYq
 *
 */
public class Solution11 {
	//305ms
	//28484k
	/*
	 * !!!!没有考虑旋转数组没有旋转的情况
	 * eg:找不到{1, 2, 3, 4, 5}的最小值
	 */
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0)
            return 0;
        if(array.length == 1)
            return array[0];
        int left = 0;
        int right = array.length - 1;
        while(right != left+1) {
            int temp = (left + right) / 2;
            if(array[temp] == array[left] && array[temp] == array[right]) {
                return findInOrder(array, left, right);
            }
            if(array[temp] >= array[left])
                left = temp;
            else if(array[temp] <= array[right])
                right = temp;
        }
        return array[right];
    
    }
    public int findInOrder(int[] array, int left, int right) {
        int min = array[left];
        for(int i = left; i <= right; i ++) {
            if(array[i] < min)
                min = array[i];
        }
        return min;
    }
}