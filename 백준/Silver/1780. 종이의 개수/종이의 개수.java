import java.io.*;

public class Main {
    public static int[][] paper;
    public static int minus = 0;
    public static int zero = 0;
    public static int plus = 0;

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

        sb.append(minus).append("\n").append(zero).append("\n").append(plus);
        System.out.println(sb.toString());
    }

    public static void partition(int row, int col, int size){
        if(check(row, col, size)){
            if(paper[row][col] == 1){
                plus++;
            }
            else if(paper[row][col] == 0){
                zero++;
            }
            else{
                minus++;
            }
            return;
        }

        size /= 3;
        partition(row, col, size);
        partition(row, col + size, size);
        partition(row, col + size + size, size);

        partition(row + size, col, size);
        partition(row + size, col + size, size);
        partition(row + size, col + size + size, size);

        partition(row + size + size, col, size);
        partition(row + size + size, col + size, size);
        partition(row + size + size, col + size + size, size);
    }

    public static boolean check(int row, int col, int size){
        int first = paper[row][col];

        for(int i = row ; i < row + size ; i++){
            for(int j = col ; j < col + size ; j++){
                if(paper[i][j] != first){
                    return false;
                }
            }
        }

        return true;
    }
}