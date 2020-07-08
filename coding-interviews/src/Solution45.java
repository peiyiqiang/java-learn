//import java.util.ArrayList;

public class Solution45 {
	//21ms
	//9468k
    public String PrintMinNumber(int [] numbers) {
        if(numbers == null) 
            return null;
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                String s1 = numbers[i] + "" + numbers[j];
                String s2 = numbers[j] + "" + numbers[i];
                if(s1.compareTo(s2) > 0) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            
            sb.append(numbers[i]);
        }
        
        return sb.toString();

    }
    
    public static void main(String[] args) {
		Solution45 s = new Solution45();
		int[] a = new int[]{3, 32, 321};
		String ans = s.PrintMinNumber(a);
		System.out.println(ans);
	}
}
