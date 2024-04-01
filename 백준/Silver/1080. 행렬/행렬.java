import java.io.*;

public class Main {
    public static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int rowCount = Integer.parseInt(input[0]);
        int colCount = Integer.parseInt(input[1]);

        int[][] A = new int[rowCount][colCount];
        int[][] B = new int[rowCount][colCount];

        for(int i = 0 ; i < rowCount ; i++){
            String curInput = br.readLine();
            curInput = curInput.replace(" ", "");
            for(int j = 0 ; j < colCount ; j++){
                A[i][j] = Integer.parseInt(curInput.substring(j, j + 1));
            }
        }

        for(int i = 0 ; i < rowCount ; i++){
            String curInput = br.readLine();
            curInput = curInput.replace(" ", "");
            for(int j = 0 ; j < colCount ; j++){
                B[i][j] = Integer.parseInt(curInput.substring(j, j + 1));
            }
        }

        if(rowCount < 3 || colCount < 3){
            for(int i = 0 ; i < rowCount ; i++){
                for(int j = 0 ; j < colCount ; j++){
                    if(A[i][j] != B[i][j]){
                        result = -1;
                        break;
                    }
                }
                if(result == -1){
                    break;
                }
            }
        }
        else{
            for(int i = 0 ; i < rowCount - 2 ; i++){
                for(int j = 0 ; j < colCount - 2 ; j++){
                    changeArr(A, B, i, j);
                }
                checkRow(A, B, i);
                if(result == -1){
                    break;
                }
            }
            for(int i = rowCount - 2 ; i < rowCount ; i++){
                checkRow(A, B, i);
            }
        }

        System.out.println(result);
    }

    public static void changeArr(int[][] A, int[][] B, int row, int col){
        if(A[row][col] != B[row][col]){
            result++;
            for(int i = row ; i < row + 3 ; i++){
                for(int j = col ; j < col + 3 ; j++){
                    A[i][j] = A[i][j] == 1 ? 0 : 1;
                }
            }
        }
    }

    public static void checkRow(int[][] A, int[][] B, int row){
        for(int i = 0 ; i < A[row].length ; i++){
            if(A[row][i] != B[row][i]){
                result = -1;
                break;
            }
        }
    }
}