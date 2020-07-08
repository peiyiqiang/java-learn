public class Solution43 {
	//15ms
	//9352k
    public int NumberOf1Between1AndN_Solution(int n) {
        if(n < 1)
            return 0;
        
        int count = 0;
        for(long i = 1; i <= n; i *= 10) {
            long divider = i * 10;
            
            count += (n / divider) * i + Math.min(Math.max(n % divider - i + 1, 0), i);
            
        }
        
        return count;
    
    }
}