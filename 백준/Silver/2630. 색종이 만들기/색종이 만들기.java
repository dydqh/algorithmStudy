import java.io.*;

public class Main {
    public static int[][] paper;
    public static int white = 0;
    public static int blue = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];

        for(int i = 0 ; i < N ; i++){
            String[] input = br.readLine().split(" ");
            for(int j = 0 ; j < N ; j++){
                paper[i][j] = Integer.parseInt(input[j]);
            }
        }

        partition(0, 0, N);

        sb.append(white).append("\n").append(blue);
        System.out.println(sb.toString());
    }

    public static void partition(int row, int col, int size){
        if(colorCheck(row, col, size)){
            if(paper[row][col] == 0){
                white++;
            }
            else{
                blue++;
            }
            return;
        }

        size /= 2;
        partition(row, col, size);
        partition(row + size, col, size);
        partition(row, col + size, size);
        partition(row + size, col + size, size);
    }

    public static boolean colorCheck(int row, int col, int size){
        int color = paper[row][col];

        for(int i = row ; i < row + size ; i++){
            for(int j = col ; j < col + size ; j++){
                if(paper[i][j] != color){
                    return false;
                }
            }
        }

        return true;
    }
}