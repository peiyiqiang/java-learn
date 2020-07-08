public class Solution42 {
	//23ms
	//9492k
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array == null)
            throw new RuntimeException("no available arrays");
        
        int sum = array[0];
        int maxSum = array[0];
        for(int i = 1; i < array.length; i++) {
            sum += array[i];
            
            if(sum > maxSum) {
                maxSum = sum;
            }
            
            if(sum < 0){
                sum = 0;
            }
        }
        
        return maxSum;
    }
}