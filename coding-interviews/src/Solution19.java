public class Solution19 {
	//19ms
	//9708k
	public boolean match(char[] str, char[] pattern)
    {
        if(str == null || pattern == null)
            return false;
        
        return matchCore(str, 0 , pattern, 0);
    }
    
    public boolean matchCore(char[] str, int i, char[] pattern, int j) {
    	if(i == str.length) {
            if(j == pattern.length)
                return true;
            else if(j < pattern.length - 1 && pattern[j+1] == '*')
                return matchCore(str,  i, pattern, j+2);
            else
                return false;
        } else if(j == pattern.length)
            return false;
        
        if(j < pattern.length - 1 && pattern[j+1] == '*') {
            if(str[i] == pattern[j] || pattern[j] == '.')
                return  matchCore(str,  i+1, pattern, j) 
                || matchCore(str,  i+1, pattern, j+2) 
                || matchCore(str,  i, pattern, j+2);
            else
                return matchCore(str,  i, pattern, j+2);
            
        } else if(str[i] == pattern[j] || pattern[j] == '.')
            return matchCore(str,  i+1, pattern, j+1);
        
        return false;
        
    }
    
    public static void main(String[] args) {
    	char[] str = {};
    	char[] pattern = {'.', '*'};
    	
    	boolean flag = new Solution19().match(str, pattern);
    	
    	System.out.println(flag);
	}
}