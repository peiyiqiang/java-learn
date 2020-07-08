public class Solution24 {
	//20ms
	//9520k
    public ListNode ReverseList(ListNode head) {
        if(head == null)
            return null;
        
        ListNode preNode = null;
        ListNode currentNode = head;
        ListNode revNode = null;
        
        while(currentNode != null) {
            preNode = currentNode;
            currentNode = preNode.next;
            preNode.next = revNode;
            revNode = preNode;
        }
        
        return revNode;

    }
}
