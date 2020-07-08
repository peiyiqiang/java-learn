import java.util.HashMap;
import java.util.Map;

public class Solution39 {
	//19ms
	//9228k
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer, Integer> count = new HashMap<>();
        
        for(int i = 0; i < array.length; i++) {
            if(count.containsKey(array[i])) {
                count.put(array[i], count.get(array[i]) + 1);
            } else {
                count.put(array[i], 1);
            }
        }
        
        int min = array.length / 2;
        int ans = 0;
        for(Integer key : count.keySet()) {
            if(count.get(key) > min) {
                ans = key;
                break;
            }
        }
        
        return ans;
    }
}
