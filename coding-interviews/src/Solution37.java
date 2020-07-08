public class Solution37 {
	//35ms
	//9668k
    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        
        SerializeCore(root, sb);
        
        return sb.toString();
  }
    
    public void SerializeCore(TreeNode root, StringBuilder sb) {
        if(root == null) {
            sb.append("#!");
            return;
        }
        
        sb.append(root.val).append("!");
        SerializeCore(root.left, sb);
        SerializeCore(root.right, sb);
    }
    
    TreeNode Deserialize(String str) {
        String[] strs = str.split("!");
        
        return DeserializeCore(strs);
  }
    
    private int i = 0;
    public TreeNode DeserializeCore(String[] strs) {
        if(strs[i].equals("#")) {
            i++;
            return null;
        }
        
        TreeNode node = new TreeNode(Integer.parseInt(strs[i]));
        i++;
        
        node.left = DeserializeCore(strs);
        
        node.right = DeserializeCore(strs);
        
        return node;
    }
    
    public static void main(String[] args) {
    	TreeNode A = new TreeNode(1);
		TreeNode B = new TreeNode(2);
		TreeNode C = new TreeNode(3);
		TreeNode D = new TreeNode(4);
		TreeNode E = new TreeNode(5);
		TreeNode F = new TreeNode(6);
		
		A.left = B;
		A.right = C;
		B.left = D;
		C.left = E;
		C.right = F;
		
		Solution37 s = new Solution37();
		String str = s.Serialize(A);
		
		System.out.println(str);
		
		TreeNode t = s.Deserialize(str);
		
		System.out.println(t);
		
	}
}