public class Solution18v2 {
	//23ms
	//9436k
    public ListNode deleteDuplication(ListNode pHead)
    {
        ListNode ptr = pHead;
        ListNode pPre = null;
        boolean needDelete = false;
        while(ptr != null) {
            if(ptr.next != null && ptr.val == ptr.next.val) 
                needDelete = true;
            
            if(needDelete) {
                ListNode pNext = ptr.next;
                while(pNext != null && pNext.val == ptr.val)
                    pNext = pNext.next;
                
                if(pPre == null) {
                	if(pNext == null)
                		return null;
                	else {
                		pHead = pNext;
                		ptr = pNext;
                	}
                }
                else {
                	pPre.next = pNext;
                	ptr = pNext;
                }
                	
                
                needDelete = false;
            }
            else {
            	pPre = ptr;
            	ptr = ptr.next;
            }
                
        }
        return pHead;

    }
    
    public static void main(String[] args) {
		ListNode pHead = new ListNode(1);
		
		ListNode temp = new ListNode(1);
		ListNode ptr = pHead;
		ptr.next = temp;
		ptr = ptr.next;
		
		temp = new ListNode(2);
		ptr.next = temp;
		ptr = ptr.next;
		
		temp = new ListNode(3);
		ptr.next = temp;
		ptr = ptr.next;
		
		temp = new ListNode(4);
		ptr.next = temp;
		ptr = ptr.next;
		
		temp = new ListNode(5);
		ptr.next = temp;
		ptr = ptr.next;
		
		temp = new ListNode(5);
		ptr.next = temp;
		
		Solution18v2 s = new Solution18v2();
		pHead = s.deleteDuplication(pHead);
		
		System.out.println("break point");
		
	}
}
