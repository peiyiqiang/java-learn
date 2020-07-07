import java.util.ArrayList;
import java.util.List;

class Solution78 {
    
    int length = 0;
    List<List<Integer>> results = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        
        if (nums == null || nums.length == 0) {
            return results;
        }
        
        List<Integer> result = new ArrayList<>();
        length = nums.length;
        
        subsetsCore(nums, 0, result);

        return results;
        
    }
    
    public void subsetsCore(int[] nums, int index, List<Integer> result) {
        
        if (index == length) {
            List<Integer> temp = new ArrayList<>();
            temp.addAll(result);
            results.add(temp);
            return;
        }
        
        subsetsCore(nums, index+1, result);

        result.add(nums[index]);
        subsetsCore(nums, index+1, result);
        result.remove(result.size()-1);

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};

        System.out.println(new Solution78().subsets(nums));
    }
}