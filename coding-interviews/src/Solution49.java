public class Solution49 {
	//13ms
	//9296k
    public int GetUglyNumber_Solution(int index) {
        if(index <= 0)
            return 0;
        
        int[] ugly = new int[index];
        ugly[0] = 1;
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;
        int count = 1;
        
        while(count < index) {
            ugly[count] = Math.min(Math.min(ugly[p2] * 2, ugly[p3] * 3), ugly[p5] * 5);
            
            if(ugly[p2] * 2 <= ugly[count])
                p2++;
            if(ugly[p3] * 3 <= ugly[count])
                p3++;
            if(ugly[p5] * 5 <= ugly[count])
                p5++;
            
            count++;
        }
        
        return ugly[index - 1];
    }
    
    public static void main(String[] args) {
		System.out.println("aaaaaaaaaa");
	}
}
