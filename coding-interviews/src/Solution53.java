public class Solution53 {
	//19ms
	//9308k
    public int GetNumberOfK(int [] array , int k) {
       
        if(array == null || array.length == 0)
            return 0;
        
        int first = GetFirstK(array , k);
        int last = GetLastK(array , k);
        
        if(first > -1 && last > -1)
            return last - first + 1;
        
        return 0;
        
    }
    
    public int GetFirstK(int [] array , int k) {
        
        int left = 0;
        int right = array.length - 1;
        int mid;
        
        while(left <= right) {
            mid = (left + right) >> 1;
            
            if(array[mid] < k) {
                left = mid + 1;
            } else if(array[mid] > k) {
                right = mid - 1;
            } else {
                if(mid == 0 || array[mid-1] != k)
                    return mid;
                else
                    right = mid - 1;
            }
        }
        
        return -1;
    }
    
    public int GetLastK(int [] array , int k) {
        
        int length = array.length;
        int left = 0;
        int right = length - 1;
        int mid;
        
        while(left <= right) {
            mid = (left + right) >> 1;
            
            if(array[mid] < k) {
                left = mid + 1;
            } else if(array[mid] > k) {
                right = mid - 1;
            } else {
                if(mid == length - 1 || array[mid+1] != k)
                    return mid;
                else
                    left = mid + 1;
            }
        }
        
        return -1;
    }
}