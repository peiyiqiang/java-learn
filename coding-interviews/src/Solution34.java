import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution34 {
	//34ms
	//9848k
    ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        FindPathCore(root, target);
        
        Collections.sort(lists, new Comparator<ArrayList<Integer>>() {

			@Override
			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				if(o1.size() < o2.size()) {
					return 1;
				} else if(o1.size() > o2.size())  {
					return -1;					
				} else {
					return 0;
				}
			}
		});
        
        return lists;
    }
    
    public void FindPathCore(TreeNode root,int target) {
    	if(root == null)
            return;
        
        list.add(root.val);
        target -= root.val;
        
        if(target == 0 && root.left == null && root.right == null) {
            lists.add(new ArrayList<Integer>(list));
        }
        
        FindPath(root.left, target);
        FindPath(root.right, target);
        
        list.remove(list.size() - 1);
        
        return;
    }
}
