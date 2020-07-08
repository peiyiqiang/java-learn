public class Solution20 {
	//21ms
	//9452k
    public boolean isNumeric(char[] str) {
        if(str == null)
            return false;
        
        boolean point = false;
        boolean exp = false;
        
        for(int i = 0; i < str.length; i++) {
            if(str[i] == '+' || str[i] == '-') {
                if(i+1 == str.length || !(str[i+1] >= '0' && str[i+1] <= '9' || str[i+1] == '.'))
                    return false;
                
                if(!(i == 0 || str[i-1] == 'e' || str[i-1] == 'E'))
                    return false;
            
            } else if(str[i] == '.') {
                if(point || exp || !(i+1 == str.length || (str[i+1] >= '0' && str[i+1] <= '9')))
                    return false;
                
                point = true;
                
            } else if(str[i] == 'e' || str[i] == 'E') {
                if(exp || i+1 == str.length || !(str[i+1] >= '0' && str[i+1] <= '9' || str[i+1] == '+' || str[i+1] == '-'))
                    return false;
                
                exp = true;
            
            } else if(str[i] >= '0' && str[i] <= '9') {
                
            } else {
                return false;
            }
        }
        
        return true;
        
        
    }
}