class Solution {
    public int solution(int[][] board) {
        boolean[][] isMine = new boolean[board.length][board[0].length];
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[i].length ; j++){
                if(board[i][j] == 1){
                    fill(isMine, i, j);
                }
            }
        }

        int answer = 0;
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[i].length ; j++){
                if(!isMine[i][j]){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void fill(boolean[][] isMine, int i, int j){
        int startCol = i - 1;
        int endCol = i + 1;
        int startRow = j - 1;
        int endRow = j + 1;

        if(i == 0){
            startCol = 0;
        }
        if(i == isMine.length - 1){
            endCol = i;
        }

        if(j == 0){
            startRow = 0;
        }
        if(j == isMine[i].length - 1){
            endRow = j;
        }

        for(int col = startCol ; col <= endCol ; col++){
            for(int row = startRow ; row <= endRow ; row++){
                isMine[col][row] = true;
            }
        }
    }
}