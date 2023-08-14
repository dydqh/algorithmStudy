class Solution {
    public int solution(int m, int n, String[] board) {
        char[][] curBoard = new char[m][n];
        int[][] isRemove = new int[m][n];
        int result = 0;
        int removeCount = 1;

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                curBoard[i][j] = board[i].charAt(j);
            }
        }

        while(removeCount > 0){
            removeCount = 0;
            for(int i = 0 ; i < m ; i++){
                for(int j = 0 ; j < n ; j++){
                    if(isRemove[i][j] >= 0){
                        if(check(curBoard, i, j)){
                            isRemove[i][j] = 1;
                            removeCount++;
                            result++;
                        }
                    }
                }
            }

            for(int i = 0 ; i < m ; i++){
                for(int j = 0 ; j < n ; j++){
                    if(isRemove[i][j] == 1){
                        setTop(curBoard, i, j, isRemove);
                    }
                }
            }
        }

        return result;
    }

    public static void setTop(char[][] board, int i, int j, int[][] isRemove){
        int index = i;

        board[i][j] = '0';
        isRemove[i][j] = -1;

        while(index > 0){
            index--;
            isRemove[index][j] = -1;
            if(board[index][j] != '0'){
                board[i][j] = board[index][j];
                board[index][j] = '0';
                isRemove[i][j] = 0;
                i--;
            }
        }
    }

    public static boolean check(char[][] board, int i, int j){
        if(i == 0){
            if(j == 0){
                if(board[i][j] == board[i][j + 1] && board[i][j] == board[i + 1][j] && board[i][j] == board[i + 1][j + 1]){
                    return true;
                }
                else{
                    return false;
                }
            }
            else if(j == board[i].length - 1){
                if(board[i][j] == board[i][j - 1] && board[i][j] == board[i + 1][j] && board[i][j] == board[i + 1][j - 1]){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                if(board[i][j] == board[i][j + 1] && board[i][j] == board[i + 1][j] && board[i][j] == board[i + 1][j + 1]){
                    return true;
                }
                else if(board[i][j] == board[i][j - 1] && board[i][j] == board[i + 1][j] && board[i][j] == board[i + 1][j - 1]){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        else if(i == board.length - 1){
            if(j == 0){
                if(board[i][j] == board[i][j + 1] && board[i][j] == board[i - 1][j] && board[i][j] == board[i - 1][j + 1]){
                    return true;
                }
                else{
                    return false;
                }
            }
            else if(j == board[i].length - 1){
                if(board[i][j] == board[i][j - 1] && board[i][j] == board[i - 1][j] && board[i][j] == board[i - 1][j - 1]){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                if(board[i][j] == board[i][j + 1] && board[i][j] == board[i - 1][j] && board[i][j] == board[i - 1][j + 1]){
                    return true;
                }
                else if(board[i][j] == board[i][j - 1] && board[i][j] == board[i - 1][j] && board[i][j] == board[i - 1][j - 1]){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        else{
            if(j == 0){
                if(board[i][j] == board[i][j + 1] && board[i][j] == board[i - 1][j] && board[i][j] == board[i - 1][j + 1]){
                    return true;
                }
                else if(board[i][j] == board[i][j + 1] && board[i][j] == board[i + 1][j] && board[i][j] == board[i + 1][j + 1]){
                    return true;
                }
                else{
                    return false;
                }
            }
            else if(j == board[i].length - 1){
                if(board[i][j] == board[i][j - 1] && board[i][j] == board[i - 1][j] && board[i][j] == board[i - 1][j - 1]){
                    return true;
                }
                else if(board[i][j] == board[i][j - 1] && board[i][j] == board[i + 1][j] && board[i][j] == board[i + 1][j - 1]){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                if(board[i][j] == board[i][j + 1] && board[i][j] == board[i + 1][j] && board[i][j] == board[i + 1][j + 1]){
                    return true;
                }
                else if(board[i][j] == board[i][j - 1] && board[i][j] == board[i + 1][j] && board[i][j] == board[i + 1][j - 1]){
                    return true;
                }
                else if(board[i][j] == board[i][j + 1] && board[i][j] == board[i - 1][j] && board[i][j] == board[i - 1][j + 1]){
                    return true;
                }
                else if(board[i][j] == board[i][j - 1] && board[i][j] == board[i - 1][j] && board[i][j] == board[i - 1][j - 1]){
                    return true;
                }
                else{
                    return false;
                }
            }  
        }
    }
}
