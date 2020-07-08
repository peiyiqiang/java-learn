import java.util.ArrayList;

public class Solution29 {
	//38ms
	//9336k
    public ArrayList<Integer> printMatrix(int [][] matrix) {
       if(matrix == null)
           return null;
        int rMin = 0;
        int cMin = 0;
        int rMax = matrix.length - 1;
        int cMax = matrix[0].length - 1;
        
        int r = rMin;
        int c = cMin;
        int flag = 0;//0 means right, 1 means down, 2 means left, 3 means up
        
        ArrayList<Integer> list = new ArrayList<>();
        while(true) {
            if(r < rMin || r > rMax || c < cMin || c > cMax)
                break;
            
            list.add(matrix[r][c]);
            
            switch(flag) {
                case 0:
                    if(c == cMax) {
                        flag = 1;
                        rMin++;
                        r++;
                    } else {
                        c++;
                    }
                    break;
                case 1:
                    if(r == rMax) {
                        flag = 2;
                        cMax--;
                        c--;
                        
                    } else {
                        r++;
                    }
                    break;
                case 2:
                    if(c == cMin) {
                        flag = 3;
                        rMax--;
                        r--;
                    } else {
                        c--;
                    }
                    break;
                case 3:
                    if(r == rMin) {
                        flag = 0;
                        cMin++;
                        c++;
                    } else {
                        r--;
                    }
                    break;
            }
            
        }
    return list;
    }
    
    public static void main(String[] args) {
    	int[][] matrix = new int[4][];
    	matrix[0] = new int[]{1, 2, 3, 4};
    	matrix[1] = new int[]{5, 6, 7, 8};
    	matrix[2] = new int[]{9, 10, 11, 12};
    	matrix[3] = new int[]{13, 14, 15, 16};
    	
    	matrix = new int[1][];
    	matrix[0] = new int[] {1};
    	
    	Solution29 s = new Solution29();
    	ArrayList<Integer> list = s.printMatrix(matrix);
    	
    	System.out.println(list);
	}
}
