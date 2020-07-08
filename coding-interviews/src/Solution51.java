public class Solution51 {
	//679ms
	//52296k
	
	int mod = (int) 1e9 + 7;
    
    public int InversePairs(int [] array) {
        
        if(array == null || array.length == 0)
            return 0;
        
        return InversePairsCore(array, 0, array.length - 1);
    }
    
    public int InversePairsCore(int [] array, int left, int right) {
        
        if(left == right)
            return 0;
        
        int mid = (right + left) >> 1;
        int leftNum = InversePairsCore(array, left, mid);
        int rightNum = InversePairsCore(array, mid + 1, right);
        
        int num = 0;
        int i = mid;
        int j = right;
        int cursor = right - left;
        int[] temp = new int[cursor + 1];
        
        while(i >= left && j > mid) {
            if(array[i] > array[j]) {
            	num = (num + (j - mid)) % mod;
                temp[cursor--] = array[i--];
            } else {
                temp[cursor--] = array[j--];
            }
        }
        
        while(i >= left) {
            temp[cursor--] = array[i--];
        }
        
        while(j > mid) {
            temp[cursor--] = array[j--];
        }
        
        i = left;
        cursor = 0;
        while(i <= right) {
            array[i++] = temp[cursor++];
        }
        
        num = (leftNum + rightNum + num) % mod;
        
        return num;
        
    }
    
}
