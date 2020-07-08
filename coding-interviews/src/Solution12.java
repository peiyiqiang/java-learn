/**
 * #12:矩阵中的路径
 * @author pYq
 *
 */
public class Solution12 {
	//24ms
	//10036k
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        boolean[] isVisit = new boolean[rows * cols];
        for(int i = 0; i < rows; i ++) {
            for(int j = 0; j <cols; j ++) {
                if(hasPathCore(matrix, rows, cols, str, i, j, isVisit, 0))
                    return true;
            }
        }
        return false;
    }
    
    public boolean hasPathCore(char[] matrix, int rows, int cols, char[] str, int i, int j, boolean[] isVisit, int pos) {
        if(pos == str.length)
            return true;
        if(i >= 0 && i < rows && j >= 0 && j < cols && !isVisit[i * cols + j] && matrix[i * cols + j] == str[pos]){
            isVisit[i * cols + j] = true;
            if(hasPathCore(matrix, rows, cols, str, i-1, j, isVisit, pos + 1))
                return true;
            if(hasPathCore(matrix, rows, cols, str, i+1, j, isVisit, pos + 1))
                return true;
            if(hasPathCore(matrix, rows, cols, str, i, j-1, isVisit, pos + 1))
                return true;
            if(hasPathCore(matrix, rows, cols, str, i, j+1, isVisit, pos + 1))
                return true;
            isVisit[i * cols + j] = false;
            return false;
        }
        else 
            return false;
    }
    
    public static void main(String[] args) {
		char[] m = {'a', 'b', 't', 'g',
				    'c', 'f', 'c', 's',
				    'j', 'd', 'e', 'h'};
		char[] str = {'b', 'f', 'c', 'e'};
		Solution12 s = new Solution12();
		System.out.println(s.hasPath(m, 3, 4, str));
	}
}
