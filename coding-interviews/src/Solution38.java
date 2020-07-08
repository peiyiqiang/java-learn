import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Solution38 {
	//188ms
	//12516k
    private ArrayList<String> finalRes = new ArrayList<>();
    private TreeSet<String> res = new TreeSet<>();
    public ArrayList<String> Permutation(String str) {
        if(str == null || str.equals(""))
            return finalRes;
        
        char[] strs = str.toCharArray();
        Arrays.sort(strs);
        
        Permutation(strs, 0);
        
        finalRes.addAll(res);
        return finalRes;
        
    }
    
    public void Permutation(char[] strs, int cursor) {
        if(cursor == strs.length) {
            res.add(new String(strs));
            return;
        }
        
        for(int i = cursor; i < strs.length; i++) {
            char c = strs[i];
            strs[i] = strs[cursor];
            strs[cursor] = c;
            
            Permutation(strs, cursor+1);
            
            c = strs[i];
            strs[i] = strs[cursor];
            strs[cursor] = c;
        }
        
        
    }
}
