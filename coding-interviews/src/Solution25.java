public class Solution25 {
	//35ms
	//9632k
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        
        ListNode mergeNode;
        if(list1.val < list2.val) {
            mergeNode = list1;
            list1 = list1.next;
            mergeNode.next = Merge(list1, list2);
        } else {
            mergeNode = list2;
            list2 = list2.next;
            mergeNode.next = Merge(list1, list2);
        }
        
        return mergeNode;
        
    }
}
