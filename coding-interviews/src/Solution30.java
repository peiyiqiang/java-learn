import java.util.Stack;

public class Solution30 {
	//16ms
	//9080k

    Stack<Integer> sData = new Stack<>();
    Stack<Integer> sMin = new Stack<>();
    int minNum = Integer.MAX_VALUE;
    
    public void push(int node) {
        if(node < minNum)
            minNum = node;
        sData.push(node);
        sMin.push(minNum);
    }
    
    public void pop() {
        if(sData.empty())
            return ;
        sData.pop();
        sMin.pop();
        minNum = sMin.peek();
    }
    
    public int top() {
        return sData.peek();
    }
    
    public int min() {
        return minNum;
    }
}
