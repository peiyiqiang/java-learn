/**
 * #10.2:青蛙跳台阶问题
 * @author pYq
 * 
 */
public class Solution10v2 {
	//16ms
	//9332k
    public int JumpFloor(int target) {
        if(target <= 0)
            return 0;
        if(target == 1)
            return 1;
        if(target == 2)
            return 2;
        
        int temp = 1;
        int sum = 2;
        for(int i = 3; i <= target; i++) {
            sum = sum + temp;
            temp = sum - temp;
        }
        return sum;

    }
}
