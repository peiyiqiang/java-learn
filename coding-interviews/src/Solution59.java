import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Solution59 {
	//20ms
	//9268k
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        if(num == null || size > num.length || size <= 0)
            return list;
        
        Deque<Integer> deque = new LinkedList<>();
        
        
        for(int i = 0 ; i < num.length; i++) {
            if(deque.isEmpty()) {
                deque.offer(i);
            } else if(i - deque.peekFirst() >= size) {
                deque.pollFirst();
            }
            
            while((!deque.isEmpty()) && num[deque.peekLast()] <= num[i]) {
                deque.pollLast();
            }
            
            deque.offer(i);
            
            if(i >= size - 1) {
                list.add(num[deque.peekFirst()]);
            }
        }
        
        return list;
    }
}