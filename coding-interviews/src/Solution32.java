import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution32 {
	//26ms
	//9424k
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            list.add(temp.val);
            
            if(temp.left != null)
                queue.offer(temp.left);
            if(temp.right != null)
                queue.offer(temp.right);
        }
        
        return list;
    }
}
