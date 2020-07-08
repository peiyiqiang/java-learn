public class Solution58v2 {
	//22ms
	//9300k
    public String LeftRotateString(String str,int n) {
    	if(str == null || str.length() == 0)
            return str;
        
        int l = str.length();
        int realN = n % l;
        if(realN == 0) {
            return str;
        } else {
        	return str.substring(realN) + str.substring(0,realN);
        }
    }
}