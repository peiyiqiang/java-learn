import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution41 {
    //40ms
	//9612k
    int count = 0;
    PriorityQueue<Integer> min = new PriorityQueue<Integer>();
    PriorityQueue<Integer> max = new PriorityQueue<Integer>(new Comparator<Integer>() {
        
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });

    public void Insert(Integer num) {
        count++;
        if((count & 1) == 0) {
            if (!max.isEmpty() && num < max.peek()) {
                max.offer(num);
                num = max.poll();
            }
            min.offer(num);
        } else {
            if (!min.isEmpty() && num > min.peek()) {
                min.offer(num);
                num = min.poll();
            }
            max.offer(num);
        }
        
    
    }

    public Double GetMedian() {
        if(count == 0)
            throw new RuntimeException("no avalible number");
        if((count & 1) == 0) {
            return (max.peek() + min.peek()) / 2.0;
        } else {
            return (double)max.peek();
        }
    }


}
