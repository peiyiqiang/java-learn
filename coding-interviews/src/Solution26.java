public class Solution26 {
	//11ms
	//9388k
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null)
            return false;
        
        if(root1.val == root2.val) {
            if(HasSubtreeCore(root1.left, root2.left) && HasSubtreeCore(root1.right, root2.right))
                return true;
            else 
                return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
        }
        else {
            return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
        }
    }
    
    public boolean HasSubtreeCore(TreeNode root1,TreeNode root2) {
        if(root2 == null)
            return true;
        if(root1 == null)
            return false;
        
        if(root1.val != root2.val)
            return false;
        
        return HasSubtreeCore(root1.left, root2.left) && HasSubtreeCore(root1.right, root2.right);
    }
}
