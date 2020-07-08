/**
 * #13:机器人的运动范围
 * @author pYq
 *
 */
public class Solution13 {
	//18ms
	//9264k
    boolean[] isVist;
    public int movingCount(int threshold, int rows, int cols)
    {
        isVist = new boolean[rows * cols];
        
        return movingCountCore(threshold, rows, cols, 0, 0);
    }
    
    public int movingCountCore(int threshold, int rows, int cols, int row, int col) {
        if(row < 0 || row >= rows || col < 0 || col >= cols)
            return 0;
        
        int count = 0;
        if(!isVist[row * cols + col]) {
            if(accessible(threshold, row, col)) {
                isVist[row * cols + col] = true;
                count = 1 + movingCountCore(threshold, rows, cols, row - 1, col)
                          + movingCountCore(threshold, rows, cols, row + 1, col)
                          + movingCountCore(threshold, rows, cols, row, col - 1)
                          + movingCountCore(threshold, rows, cols, row, col + 1);
            }
        }
        return count;
        
    }
    
    public boolean accessible(int threshold, int row, int col) {
        int sum = 0;
        while(row != 0) {
            sum += row % 10;
            row = row / 10;
        }
        while(col != 0) {
            sum += col % 10;
            col = col / 10;
        }
        if(sum <= threshold)
            return true;
        else
            return false;
    }
}
