/**
 * #5：替换空格
 * @author pYq
 *
 */
public class Solution05 {
    public String replaceSpace(StringBuffer str) {
    	String s = str.toString();
        s = s.replace(" ", "%20");
        return s;
    }
    
    public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("We Are Happy");
		
		String ans = new Solution05().replaceSpace(sb);
		
		System.out.println(ans);
	}
}
