/**
 * #8：二叉树的下一个节点
 * @author pYq
 *
 */
public class Solution08 {
	//26ms
	//9904k
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode.right != null){
            TreeLinkNode tempNode = pNode.right;
            while(tempNode.left != null){
                tempNode = tempNode.left;
            }
            return tempNode;
        }
        else {
            TreeLinkNode tempNode = pNode;
            while(tempNode.next != null && tempNode.next.right == tempNode)
                    tempNode = tempNode.next;
            if(tempNode.next != null)
                return tempNode.next;
            else
                return null;
        }
    }
}