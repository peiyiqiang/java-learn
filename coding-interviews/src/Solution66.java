/**
 * 测试集与题目要求不符合
 * @author Ethan
 *
 */

public class Solution66 {
	//19ms
	//9316k
    public int[] multiply(int[] A) {
        if(A == null || A.length == 0)
            return A;
        
        int length = A.length;
        int[] B = new int[length];
        
        if(length > 1) {
            B[0] = 1;
            for(int i = 1; i < length; i++) {
                B[i] = B[i-1] * A[i-1];
            }
            
            int temp = A[length-1];
            for(int i = length -2; i >= 0; i--) {
                B[i] = B[i] * temp;
                temp *= A[i];
            }
            
        } else {
            B[0] = 1;
            B[length-1] = 1;
        }
        
        return B;
        
    }
}