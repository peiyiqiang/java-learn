/**
 * #10.4:矩形覆盖
 * @author pYq
 *
 */
public class Solution10v4 {
	//22ms
	//9424k
    public int RectCover(int target) {
        if(target <= 0)
            return 0;
        
        if(target <= 2)
            return target;
        
        int temp = 1;
        int sum = 2;
        for(int i = 3; i<= target; i++) {
            sum = sum + temp;
            temp = sum - temp;
        }
        return sum;

    }
}
