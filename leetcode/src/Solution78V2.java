import java.util.ArrayList;
import java.util.List;

class Solution78V2 {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        result.add(temp);
        
        for (int i = 0; i < nums.length; i++) {
            generateSubset(result, nums[i]);
        }
        return result;
    }
    
    public void generateSubset(List<List<Integer>> result, int num) {
        int size = result.size();
        for (int i = 0; i < size; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.addAll(result.get(i));
            temp.add(num);
            result.add(temp);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};

        System.out.println(new Solution78V2().subsets(nums));
    }
}