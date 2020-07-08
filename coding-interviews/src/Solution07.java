/**
 * #7:重建二叉树
 * @author pYq
 *
 */
public class Solution07 {
	//332ms
	//23168k
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode treeNode = reConstructBinaryTree(pre, 0, in, 0, in.length);
        
        return treeNode;
    }
    
    public TreeNode reConstructBinaryTree(int [] pre, int index, int [] in, int start, int end) {
        if(start >= end || index == pre.length)
            return null;
        
        TreeNode treeNode = new TreeNode(pre[index]);
        
        for(int i = start; i < end; i ++) {
            if(in[i] == pre[index]) {
                treeNode.left = reConstructBinaryTree(pre, index + 1, in, start, i);
                treeNode.right = reConstructBinaryTree(pre, index + i - start + 1, in, i + 1, end);
            }
        }
        
        return treeNode;
    }
    
    public static void main(String[] args) {
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		TreeNode treeNode = new Solution07().reConstructBinaryTree(pre, in);
		System.out.println(treeNode);
	}
}
