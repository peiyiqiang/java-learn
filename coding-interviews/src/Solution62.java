public class Solution62 {
	//15ms
	//9272k
    public int LastRemaining_Solution(int n, int m) {
        if(n < 1 || m < 1)
            return -1;
        
        int ans = 0;
        for(int i = 2; i <= n; i++)
            ans = (ans + m) % i;
        
        return ans;
    }
}