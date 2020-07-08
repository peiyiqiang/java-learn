public class Solution55v2 {
	//16ms
	//9308k
    public boolean IsBalanced_Solution(TreeNode root) {
        if(IsBalanced_Solution_Core(root) == -1)
            return false;
        
        return true;
        
    }
    
    public int IsBalanced_Solution_Core(TreeNode root) {
        if(root == null)
            return 0;
        
        int left = IsBalanced_Solution_Core(root.left);
        if(left == -1) return -1;
        
        int right = IsBalanced_Solution_Core(root.right);
        if(right == -1) return -1;
        
        if(Math.abs(left - right) <= 1) {
            return (left > right ? left : right) + 1;
        }
        
        return -1;
        
    }
}