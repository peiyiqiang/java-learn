public class Solution55 {
	//13ms
	//9412k
    public int TreeDepth(TreeNode root) {
        if(root == null)
            return 0;
        
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        
        int depth = (left > right ? left : right) + 1;
        return depth;
    }
}