public class Solution65 {
	//15ms
	//9376k
    public int Add(int num1,int num2) {
        int sum = 0;
        int carry = 0;
        
        sum = num1 ^ num2;
        carry = (num1 & num2) << 1;
        while(carry != 0) {
        	num1 = sum;
            num2 = carry;
            sum = num1 ^ num2;
            carry = (num1 & num2) << 1;
        }
        
        return sum;
    }
}