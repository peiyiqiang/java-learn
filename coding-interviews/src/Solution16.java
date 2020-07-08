public class Solution16 {
	//73ms
	//10408k
    public double Power(double base, int exponent) {
        if(base == 0)
            return 0;
        if(exponent == 0)
            return 1;
        
        boolean isNegative = false;
        if(exponent < 0) {
            exponent = - exponent;
            isNegative = true;
        }
        
        double ans = 1;
        while(exponent > 0) {
        	//example:
        	//when exp = 10(0b1100), exp = 2 + 8(0b0100 + 0b1000)
        	//thus base^10 = base^2 * base^8
            if((exponent & 1) == 1)
                ans *= base;
            exponent = exponent >> 1;
            base *= base;
        }
        
        if(isNegative)
            ans = 1.0 / ans;
        
        return ans;
  }
}
