import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Solution32v3 {
	//27ms
	//9556k
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if(pRoot == null) 
            return lists;
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.offer(pRoot);
        int nodeNum = 1;
        int nextNodeNum = 0;
        int level = 1;
        while(!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            while(nodeNum > 0) {
                TreeNode temp = queue.poll();
                nodeNum--;
                list.add(temp.val);
                
                if(temp.left != null) {
                    queue.offer(temp.left);
                    nextNodeNum++;
                }
                if(temp.right != null) {
                    queue.offer(temp.right);
                    nextNodeNum++;
                }
            }
            
            if(level % 2 == 0)
                Collections.reverse(list);
            
            lists.add(list);
            nodeNum = nextNodeNum;
            level++;
            nextNodeNum = 0;
        }
        
        return lists;
    
    }
    
}
