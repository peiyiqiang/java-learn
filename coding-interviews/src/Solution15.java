public class Solution15 {
	//22ms
	//9484k
    public int NumberOf1(int n) {
        if(n == 0)
            return 0;
        
        int num = 0;
        int flag = 1;
        while(flag != 0) {
        	int temp = n & flag;
            if(temp != 0)
                num ++;
            flag = flag << 1;
        }
        return num;
    }
    
    public static void main(String[] args) {
		Solution15 s = new Solution15();
		System.out.println(s.NumberOf1(-2));
	}
}
