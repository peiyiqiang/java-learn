/**
 * #14:剪绳子
 * @author pYq
 *
 */
public class Solution14 {
	//18ms
	//9540k
    public int cutRope(int target) {
        if(target < 2 || target > 60)
            return 0;
        if(target == 2)
            return 1;
        if(target == 3)
            return 2;
        
        int[] ans = new int[target + 1];
        ans[1] = 1;
        ans[2] = 2;
        ans[3] = 3;
        for(int i = 4; i <= target; i++) {
            for(int j = 1; j <= i/2; j++) {
                int temp = ans[j] * ans[i - j];
                if(temp > ans[i])
                    ans[i] = temp;
            }
        }
        return ans[target];

    }
}
