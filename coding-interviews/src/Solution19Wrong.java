public class Solution19Wrong {
    public boolean match(char[] str, char[] pattern)
    {
        int i = 0;
        int j = 0;
        //str     = "aaabb"
        //pattern = "ab*ac*ab*"
        while(true) {
            if(i >= str.length) {
            	if(j >= pattern.length)
            		return true;
                else if(j == pattern.length - 1 && pattern[j] == '*')
                    return true;
                else if(j == pattern.length - 2 && pattern[j+1] == '*')
                    return true;
            	else
            		return false;
            }
            if(j >= pattern.length)
                return false;
            
            if(str[i] == pattern[j] || pattern[j] == '.') {
                i++;
                j++;
            }
            
            else if(pattern[j] == '*') {
            	// 重点关注
            	//"asdasdfasdfas"
            	//".*"
            	int temp = i - 1;
            	int sNum = 1;
            	while(i < str.length && (str[i] == str[temp])) {
            		sNum++;
            		i++;
            	}
            	
            	j++;
            	
            	int pNum = 0;
            	while(j < pattern.length && pattern[j] == str[temp]) {
            		pNum++;
            		j++;
            	}
            	
            	if(pNum > sNum)
            		return false;
            }
            
            else if(pattern[j+1] == '*') {
                j = j + 2;
            }
            
            else
                return false;
        }
    }
    
    public static void main(String[] args) {
		Solution19Wrong s = new Solution19Wrong();		
		char[] str = "aaab".toCharArray();
		char[] pattern = "ab*aab*".toCharArray();
		System.out.println(s.match(str, pattern));
	}
}
