import java.util.ArrayList;

public class Solution57 {
	//20ms
	//9456k
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        
        if(array == null || array.length < 2)
            return list;
        
        int left = 0;
        int right = array.length - 1;
        while(left < right) {
            int curSum = array[left] + array[right];
            
            if(curSum == sum) {
                list.add(array[left]);
                list.add(array[right]);
                break;
            } else if(curSum < sum) {
                left++;
            } else {
                right--;
            }
        }
        
        return list;
    }
}