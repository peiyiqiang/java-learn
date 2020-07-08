public class Solution67 {
	//15ms
	//9180k
    public int StrToInt(String str) {
        
        if(str == null || str.length() == 0)
            return 0;
        
        long res = 0;
        boolean neg = false;
        
        if(str.charAt(0) == '-') {
        	neg = true;
        } else if(str.charAt(0) == '+') {
            
        } else if(str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            res += (str.charAt(0) - '0');
        } else {
            return 0;
        }
        
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                res = res * 10 + (str.charAt(i) - '0');
            } else {
                return 0;
            }
        }
        
        if(neg)
            res = -res; 
        
        if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE)
            return 0;
        
        return (int)res;
    }
}