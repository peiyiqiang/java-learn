/**
 * #10.3:青蛙跳台阶扩展
 * @author pYq
 *
 */
public class Solution10v3 {
	//19ms
	//9268k
    public int JumpFloorII(int target) {
        if(target <= 0)
            return 0;
        
        return 1 << (target - 1);
    }
    
    public static void main(String[] args) {
    	Solution10v3 s = new Solution10v3();
    	int test = s.JumpFloorII(3);
    	System.out.println(test);
	}
}
