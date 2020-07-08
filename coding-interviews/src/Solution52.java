import java.util.ArrayList;

public class Solution52 {
	//24ms
	//9612k
	//没有考虑链表有环的情况
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        
        if(pHead1 == null || pHead2 == null)
            return null;
        
        ArrayList<ListNode> list = new ArrayList<>();
        
        ListNode p = pHead1;
        while(p != null) {
            list.add(p);
            p = p.next;
        }
        
        p = pHead2;
        while(p != null) {
            if(list.contains(p))
                return p;
            p = p.next;
        }
        
        return null;
 
    }
}
