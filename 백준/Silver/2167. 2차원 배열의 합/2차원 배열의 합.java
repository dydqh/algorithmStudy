import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[][] array = new int[n][m];
        int[][] sum = new int[n][m];

        input = br.readLine().split(" ");
        for(int i = 0 ; i < m ; i++){
            array[0][i] = Integer.parseInt(input[i]);

            if(i == 0){
                sum[0][i] = array[0][i];
            }
            else {
                sum[0][i] = array[0][i] + sum[0][i - 1];
            }
        }

        for(int i = 1 ; i < n ; i++){
            input = br.readLine().split(" ");

            for(int j = 0 ; j < m ; j++){
                array[i][j] = Integer.parseInt(input[j]);

                if(j == 0){
                    sum[i][j] = array[i][j] + sum[i - 1][j];
                }
                else {
                    sum[i][j] = array[i][j] + sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
                }
            }
        }

        int k = Integer.parseInt(br.readLine());

        for(int index = 0 ; index < k ; index++){
            input = br.readLine().split(" ");
            int i = Integer.parseInt(input[0]) - 1;
            int j = Integer.parseInt(input[1]) - 1;
            int x = Integer.parseInt(input[2]) - 1;
            int y = Integer.parseInt(input[3]) - 1;

            int result = sum[x][y];
            result -= (j > 0 ? sum[x][j - 1] : 0);
            result -= (i > 0 ? sum[i - 1][y] : 0);
            result += (i > 0 && j > 0 ? sum[i - 1][j - 1] : 0);
            sb.append(result).append("\n");
        }
        
        System.out.println(sb.toString());
    }
}