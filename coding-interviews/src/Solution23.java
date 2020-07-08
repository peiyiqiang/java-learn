import java.util.ArrayList;
import java.util.List;

public class Solution23 {
	//22ms
	//9464k
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null)
            return null;
        
        List<ListNode> list = new ArrayList<>();
        
        ListNode tempNode = pHead;
        while(tempNode != null) {
            if(!list.isEmpty() && list.contains(tempNode))
                return tempNode;
            list.add(tempNode);
            tempNode = tempNode.next;
        }
        return null;
    }
}
