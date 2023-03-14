import java.io.*;

public class Main {
    public static int[][] board;
    public static int white = 0;
    public static int blue = 0;
    public static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        board = new int[N][N];

        for(int i = 0 ; i < N ; i++){
            String input = br.readLine();
            for(int j = 0 ; j < N ; j++){
                board[i][j] = input.charAt(j) - 48;
            }
        }

        partition(0, 0, N);

        System.out.println(sb.toString());
    }

    public static void partition(int row, int col, int size){
        if(check(row, col, size)){
            sb.append(board[row][col]);
            return;
        }

        size /= 2;
        sb.append("(");
        partition(row, col, size);
        partition(row, col + size, size);
        partition(row + size, col, size);
        partition(row + size, col + size, size);
        sb.append(")");
    }

    public static boolean check(int row, int col, int size){
        int first = board[row][col];

        for(int i = row ; i < row + size ; i++){
            for(int j = col ; j < col + size ; j++){
                if(board[i][j] != first){
                    return false;
                }
            }
        }

        return true;
    }
}