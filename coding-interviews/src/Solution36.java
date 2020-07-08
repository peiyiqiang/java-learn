public class Solution36 {
    //20ms
	//9356k
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null)
            return null;
        
        ConvertCore(pRootOfTree);
        
        TreeNode ConvertedRoot = pRootOfTree;
        while(ConvertedRoot.left != null) {
            ConvertedRoot = ConvertedRoot.left;
        }
        return ConvertedRoot;
    }
    
    public void ConvertCore(TreeNode pRootOfTree) {
        
        TreeNode leftNode = pRootOfTree.left;
        TreeNode rightNode = pRootOfTree.right;
        TreeNode temp = null;
        
        if(leftNode != null) {
        	ConvertCore(leftNode);
        	
            temp = leftNode;
            while(temp.right != null) {
                temp = temp.right;
            }
            
            temp.right = pRootOfTree;
            pRootOfTree.left = temp;
        }
        
        if(rightNode != null) {
        	ConvertCore(rightNode);
        	
            temp = rightNode;
            while(temp.left != null) {
                temp = temp.left;
            }
            
            temp.left = pRootOfTree;
            pRootOfTree.right = temp;
        }
    }
    
    public static void main(String[] args) {
		TreeNode A = new TreeNode(1);
		TreeNode B = new TreeNode(2);
		TreeNode C = new TreeNode(3);
		TreeNode D = new TreeNode(4);
		TreeNode E = new TreeNode(5);
		TreeNode F = new TreeNode(6);
		TreeNode G = new TreeNode(7);
		
		A.left = B;
		A.right = C;
		B.left = D;
		B.right = E;
		C.left = F;
		C.right = G;
		
		Solution36 s = new Solution36();
		TreeNode ans = s.Convert(A);
		
		System.out.println(ans.val);
	}

}
