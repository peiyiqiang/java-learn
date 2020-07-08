//题解有：最大最小边界约束法
public class Solution33 {
	//17ms
	//9284k
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0)
            return false;
        
        return VerifySquenceOfBSTCore(sequence, 0, sequence.length);
    }
    
    public boolean VerifySquenceOfBSTCore(int [] sequence, int start, int end) {
        int length = end - start;
        if(length < 3)
            return true;
        
        int root = sequence[end - 1];
        
        int left = start;
        while(left < end - 1) {
            if(sequence[left] < root)
                left++;
            else
                break;
        }
        
        int right = left;
        while(right < end - 1) {
            if(sequence[right] > root)
                right++;
            else
                return false;
        }
        
        boolean verify = true;
        if(left > start)
            verify = VerifySquenceOfBSTCore(sequence, start, left);
        
        if(verify && left < end - 1)
            verify = VerifySquenceOfBSTCore(sequence, left, end - 1);
        
        return verify;
    }
}