import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//40
public class Solution40 {
	//29ms
	//9640k
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(input == null || k <= 0 || k > input.length)
            return ans;
        
        Arrays.sort(input);
        
        for(int i = 0; i < k; i++) {
            ans.add(input[i]);
        }
        
        return ans;
        
    }
}