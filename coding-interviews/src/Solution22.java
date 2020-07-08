//题解有快慢指针法

public class Solution22 {
	//24ms
	//9648k
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k == 0)
            return null;
        
        int nodeNum = 0;
        ListNode tempNode = head;
        while(tempNode != null) {
            nodeNum++;
            tempNode = tempNode.next;
        }
        
        if(nodeNum < k)
            return null;
        
        k = nodeNum - k + 1;
        tempNode = head;
        for(int i = 1; i < k; i++) {
            tempNode = tempNode.next;
        }
        
        return tempNode;

    }
}
