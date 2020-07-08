import java.util.ArrayList;

public class Solution57v2 {
	//26ms
	//9772k
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        if(sum <= 1)
            return list;
        
        int small = 1;
        int big = 2;
        int curSum = 3;
        while(small < big) {
            if(curSum < sum) {
                big++;
                curSum += big;
            } else if(curSum > sum) {
                curSum -= small;
                small++;
            } else {
                ArrayList<Integer> ans = new ArrayList<>();
                for(int i = small; i <= big; i++) {
                    ans.add(i);
                }
                list.add(ans);
                curSum -= small;
                small++;
            }
        }
        
        return list;
    }
}