/**
 * #10:斐波那契数列
 * @author pYq
 *
 */
public class Solution10 {
	//1295ms
	//9272k
    public int Fibonacci(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return Fibonacci(n-1) + Fibonacci(n-2);

    }
}
