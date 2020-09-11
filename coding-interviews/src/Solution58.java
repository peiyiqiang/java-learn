public class Solution58 {
    public String ReverseSentence(String str) {
    	if(str == null)
            return null;
        
        if(str.equals(" "))
            return " ";
        
        String[] s = str.split(" ");
        
        StringBuilder sb = new StringBuilder();
        for(int i = s.length - 1; i >= 0; i--) {
            if(i == 0)
                sb.append(s[i]);
            else
                sb.append(s[i]).append(" ");
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
		String s = new Solution58().ReverseSentence("a good   example");
		System.out.println(s);

		String ss = "  ";
		ss = ss.trim();
		System.out.println(ss.equals(""));
	}
}