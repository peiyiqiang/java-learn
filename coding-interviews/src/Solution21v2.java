public class Solution21v2 {
	//21ms
	//9352k
    public void reOrderArray(int [] array) {
        int len = array.length;
        if(len == 0)
            return;
        int[] evenNum = new int[len];
        
        int evenCount = 0;
        for(int i = 0; i < len; i++) {
            if(array[i] % 2 == 0) {
                evenNum[evenCount] = array[i];
                evenCount++;
            }
        }
        
        int ptr = 0;
        for(int i = 0; i < len; i++) {
            if(array[i] % 2 != 0) {
                array[ptr] = array[i];
                ptr++;
                if(ptr >= len - evenCount)
                    break;
            }
        }
        for(int i = 0; i < evenCount; i++) {
            array[ptr] = evenNum[i];
                ptr++;
        }
    }
    
    public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		for(int i:array) {
			System.out.println(i);
		}
		Solution21v2 s = new Solution21v2();
		s.reOrderArray(array);
		for(int i:array) {
			System.out.println(i);
		}
	}
}
