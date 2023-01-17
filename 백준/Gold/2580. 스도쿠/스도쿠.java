import java.io.*;

class Main{
    public static int[][] arr = new int[9][9];
    public static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 8 ; i >= 0 ; i--){
            String[] tempInput = br.readLine().split(" ");
            for(int j = 0 ; j < 9 ; j++){
                arr[i][j] = Integer.parseInt(tempInput[j]);
            }
        }

        sudoku(0, 0);
    }

    public static void sudoku(int row, int col){
        if(col == 9){
            sudoku(row + 1, 0);
            return;
        }

        if(row == 9){
            for(int i = 8 ; i >= 0 ; i--){
                for(int j = 0 ; j < 9 ; j++){
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }
    
            System.out.println(sb.toString());

            System.exit(0);
        }

        if(arr[row][col] == 0){
            for(int i = 1 ; i <= 9 ; i++){
                if(isPossible(row, col, i)){
                    arr[row][col] = i;
                    sudoku(row, col + 1);
                }
            }
            arr[row][col] = 0;
            return;
        }

        sudoku(row, col + 1);
    }

    public static boolean isPossible(int row, int col, int target){
        for(int j = 0 ; j < 9 ; j++){
            if(arr[row][j] == target){
                return false;
            }
        }

        for(int j = 0 ; j < 9 ; j++){
            if(arr[j][col] == target){
                return false;
            }
        }

        for(int j = row / 3 * 3 ; j < row / 3 * 3 + 3 ; j++){
            for(int k = col / 3 * 3 ; k < col / 3 * 3 + 3 ; k++){
                if(arr[j][k] == target){
                    return false;
                }
            }
        }

        return true;
    }
}