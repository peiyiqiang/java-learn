import java.util.Stack;


public class Solution31 {
	//16ms
	//9288k
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length == 0 || popA.length == 0 || pushA.length != popA.length)
            return false;
        
        boolean isPopOrder = false;
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int j = 0;
        while(i < pushA.length) {
            stack.push(pushA[i]);
            i++;
            
            while(!stack.empty()) {
                if(stack.peek() != popA[j])
                    break;
                
                stack.pop();
                j++;
            }
        }
        
        if(i == pushA.length && j == popA.length)
            isPopOrder = true;
        
        return isPopOrder;
    }
}