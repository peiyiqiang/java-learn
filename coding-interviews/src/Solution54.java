public class Solution54 {
	//36ms
	//9696k
	private int copyK;
    
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot == null || k == 0)
            return null;
        
        copyK = k;
        return KthNodeCore(pRoot);
        
    }
    
    TreeNode KthNodeCore(TreeNode p)
    {
        TreeNode target = null;
        
        if(p.left != null)
            target = KthNodeCore(p.left);
        
        if(target == null) {
            if(copyK == 1)
                target = p;
            
            copyK--;
        }
        
        if(target == null && p.right != null)
            target = KthNodeCore(p.right);
        
        return target;
        
    }
}