public class Solution56 {
	//12ms
	//9652k
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array == null || array.length < 2)
            return;
        
        int temp = 0;
        for(int i = 0; i < array.length; i++)
            temp ^= array[i];
        
        int tempBit = 1;
        while((temp & tempBit) == 0)
        	tempBit = tempBit << 1;
        
        num1[0] = 0;
        num2[0] = 0;
        for(int i = 0; i < array.length; i++) {
            if((tempBit & array[i]) == 0)
                num1[0] ^= array[i];
            else
                num2[0] ^= array[i];
        }
        
    }
}