class Solution
{
    public static int[][] result;

    public int solution(int [][]board)
    {
        result = new int[board.length][board[0].length];
        int max = 0;

        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[i].length ; j++){
                result[i][j] = update(board, i, j);
                max = max > result[i][j] ? max : result[i][j];
            }
        }

        return max * max;
    }
    
    public static int update(int[][] board, int i, int j){
        if(i > 0 && j > 0){
            int min = 0;
            
            if(board[i - 1][j - 1] > 0 && board[i - 1][j] > 0 && board[i][j - 1] > 0 && board[i][j] > 0){
                min = Math.min(result[i - 1][j - 1], result[i - 1][j]);
                min = Math.min(min, result[i][j - 1]);
            }

            if(min == 0){
                return board[i][j];
            }
            else{
                return min + 1;
            }
        }
        else{
            return board[i][j];
        }
    }
}