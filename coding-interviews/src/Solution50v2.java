import java.util.LinkedHashMap;
import java.util.Map;

public class Solution50v2 {
	//38ms
	//9580k
    
    LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
    
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(map.containsKey(ch))
                map.replace(ch, -1);
            else
                map.put(ch, 1);
        
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1)
                return entry.getKey();
        }
        
        return '#';
    
    }
}