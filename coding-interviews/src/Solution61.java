import java.util.Arrays;

public class Solution61 {
	//20ms
	//9396k
    public boolean isContinuous(int [] numbers) {
        
        if(numbers == null || numbers.length == 0)
            return false;
        
        Arrays.sort(numbers);
        
        int numberOfZero = 0;
        for(int i = 0; numbers[i] == 0; i++)
            numberOfZero++;
        
        for(int i = numberOfZero; i < numbers.length - 1; i++) {
            int diff = numbers[i+1] - numbers[i];
            if(diff == 0 || diff >= 5)
                return false;
            
            numberOfZero = numberOfZero - (diff - 1);
            if(numberOfZero < 0)
                return false;
        }
        
        return true;
    }
}