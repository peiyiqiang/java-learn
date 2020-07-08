public class Solution27 {
	//26ms
	//9572k
    public void Mirror(TreeNode root) {
        if(root == null)
            return;
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
