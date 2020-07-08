import java.util.ArrayList;
import java.util.Collections;

/**
 * #6：从尾到头打印链表
 * @author pYq
 *
 */
public class Solution06 {
	//18ms
	//9288k
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = listNode;
        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.reverse(list);
        return list;
        
    }
}
