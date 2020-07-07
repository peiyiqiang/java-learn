class Solution79 {
    
    char[][] boardCopy = null;
    String wordCopy = null;
    boolean[][] visited = null;
    int row;
    int col;
    int wordLength = 0;
    
    public boolean exist(char[][] board, String word) {
        
        if (board == null || board.length == 0) {
            if (word == null) {
                return true;
            }
            else {
                return false;
            }
        }
        if (word == null || word.length() == 0) {
           return true;
        }
        
        row = board.length;
        col = board[0].length;
        wordLength = word.length();
        
        boardCopy = board;
        wordCopy = word;
        visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (boardCopy[i][j] == word.charAt(0)) {
                    visited[i][j] = true;
                    if (existCore(1, i, j)) {
                        return true;
                    }
                    visited[i][j] = false;
                }
            }
        }

        return false;
    }
    
    public boolean existCore(int index, int r, int c) {

        if(index == wordLength) {
            return true;
        }

        boolean flag = false;

        if (r > 0 && !visited[r-1][c] && boardCopy[r-1][c] == wordCopy.charAt(index)) {
            visited[r-1][c] = true;
            if(existCore(index+1, r-1, c)) {
                return true;
            }
            visited[r-1][c] = false;
        }
        if (r < row - 1 && !visited[r+1][c] && boardCopy[r+1][c] == wordCopy.charAt(index)) {
            visited[r+1][c] = true;
            if(existCore(index+1, r+1, c)) {
                return true;
            }
            visited[r+1][c] = false;
        }
        if (c > 0 && !visited[r][c-1] && boardCopy[r][c-1] == wordCopy.charAt(index)) {
            visited[r][c-1] = true;
            if(existCore(index+1, r, c-1)) {
                return true;
            }
            visited[r][c-1] = false;
        }
        if (c < col - 1 && !visited[r][c+1] && boardCopy[r][c+1] == wordCopy.charAt(index)) {
            visited[r][c+1] = true;
            if(existCore(index+1, r, c+1)) {
                return true;
            }
            visited[r][c+1] = false;
        }

        return false;
        
    }

    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};

        String word = "ABCB";

        System.out.println(new Solution79().exist(board, word));

    }

}