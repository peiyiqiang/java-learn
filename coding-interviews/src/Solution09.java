import java.util.Stack;

/**
 * #9:栈和队列
 * @author pYq
 *
 */
public class Solution09 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
        if(stack2.empty()) {
            while(!stack1.empty()) {
                int temp = stack1.pop();
                stack2.push(temp);
            }
        }
        
        return stack2.pop();
    
    }
}
