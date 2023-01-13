import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        int[][] board = new int[row][col];
        
        for(int i = 0 ; i < row ; i++){
            String tempInput = br.readLine();
            for(int j = 0 ; j < col ; j++){
                board[i][j] = tempInput.charAt(j);
            }
        }

        int min = 33;

        for(int i = 0 ; i <= row - 8 ; i++){
            for(int j = 0 ; j <= col - 8 ; j++){
                if(i == 0 && j == 0){
                    min = chessCheck(board, i, j);
                    int a = 00;
                }
                else{
                    int target = chessCheck(board, i, j);
                    min = min > target ? target : min;
                }
            }
        }

        System.out.println(min);
    }

    public static int chessCheck(int[][] list, int startRow, int startCol){
        int result = 0;
        int first = 0; //87 - W / 66 - B
        int curColor = 0;
        
        for(int i = startRow ; i < startRow + 8 ; i++){
            if(i == startRow){
                first = list[i][startCol];
                curColor = first;
            }
            else{
                if(list[i][startCol] == curColor){
                    result += 1;
                }
                if(curColor == 87){
                    curColor = 66;
                }
                else{
                    curColor = 87;
                }
            }
            
            for(int j = 1 ; j < 8 ; j++ ){
                if(j % 2 == 0 && list[i][j + startCol] != curColor){
                    result += 1;
                }
                else if(j % 2 == 1 && list[i][j + startCol] == curColor){
                    result += 1;
                }
            }
        }
        return result > 32 ? 64 - result : result;
    }
}