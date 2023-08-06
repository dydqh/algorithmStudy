import java.io.*;

public class Main {
    public static int x = 0;
    public static int y = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for(int i = 0; i < n / 2 + 1 ; i++){
            cal(n - (i * 2), arr, i, target);
        }


        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }

        sb.append(y).append(" ").append(x);
        System.out.println(sb.toString());
    }

    public static void cal(int n, int[][] arr, int i, int target){
        int start = n * n;

        for(int j = i ; j < n + i ; j++){
            if(target == start){
                x = i + 1;
                y = j + 1;
            }

            arr[j][i] = start;
            start--;
        }

        for(int j = i + 1 ; j < n + i ; j++){
            if(target == start){
                x = j + 1;
                y = n + i;
            }

            arr[n - 1 + i][j] = start;
            start--;
        }

        for(int j = n - 2 ; j >= 0 ; j--){
            if(target == start){
                x = n + i;
                y = j + i + 1;
            }

            arr[j + i][n - 1 + i] = start;
            start--;
        }

        for(int j = n - 2 + i ; j > i ; j--){
            if(target == start){
                x = j + 1;
                y = i + 1;
            }

            arr[i][j] = start;
            start--;
        }
    }
}