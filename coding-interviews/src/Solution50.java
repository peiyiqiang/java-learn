import java.util.LinkedHashMap;

public class Solution50 {
	//49ms
	//10032k
    public int FirstNotRepeatingChar(String str) {
        
        if(str == null || str.length() == 0)
            return -1;
        
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        
        for(int i = 0; i < str.length(); i ++) {
            char c = str.charAt(i);
            if(map.containsKey(c))
            	map.replace(c, -1);
            else
                map.put(c, i);
        }
        
        for(int ans : map.values()) {
            if(ans != -1)
                return ans;
        }
        
        return -1;
    }
}