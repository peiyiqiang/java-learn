public class Solution28 {
	//19ms
	//9344k
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot == null)
            return true;
        
        boolean isSymmetrical = isSymmetrical(pRoot.left, pRoot.right);
        
        return isSymmetrical;
    }
    
    boolean isSymmetrical(TreeNode pLeft, TreeNode pRight) {
        if(pLeft == null && pRight == null)
            return true;
        
        boolean isSymmetrical = false;
        if(pLeft != null && pRight != null) {
            if(pLeft.val == pRight.val) {
                isSymmetrical = isSymmetrical(pLeft.left, pRight.right) && isSymmetrical(pLeft.right, pRight.left);
            }
        }
        
        return isSymmetrical;
    }
}
