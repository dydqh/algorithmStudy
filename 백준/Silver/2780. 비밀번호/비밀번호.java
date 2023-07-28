import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        int[][] dp = new int[1001][10];
        int mod = 1234567;

        for(int i = 0 ; i < 10 ; i++){
            dp[1][i] = 1;
        }

        for(int i = 2 ; i <= 1000 ; i++){
            dp[i][0] = dp[i - 1][7] % mod;
            dp[i][1] = (dp[i - 1][2] + dp[i - 1][4]) % mod;
            dp[i][2] = (dp[i - 1][1] + dp[i - 1][3] + dp[i - 1][5]) % mod;
            dp[i][3] = (dp[i - 1][2] + dp[i - 1][6]) % mod;
            dp[i][4] = (dp[i - 1][1] + dp[i - 1][5] + dp[i - 1][7]) % mod;
            dp[i][5] = (dp[i - 1][2] + dp[i - 1][4] + dp[i - 1][6] + dp[i - 1][8]) % mod;
            dp[i][6] = (dp[i - 1][3] + dp[i - 1][5] + dp[i - 1][9]) % mod;
            dp[i][7] = (dp[i - 1][4] + dp[i - 1][8] + dp[i - 1][0]) % mod;
            dp[i][8] = (dp[i - 1][5] + dp[i - 1][7] + dp[i - 1][9]) % mod;
            dp[i][9] = (dp[i - 1][6] + dp[i - 1][8]) % mod;
        }

        for(int i = 0 ; i < t ; i++){
            int curNumber = Integer.parseInt(br.readLine());
            int curSum = 0;
            for(int j = 0 ; j < 10 ; j++){
                curSum += dp[curNumber][j];
            }
            sb.append(curSum % mod).append("\n");
        }

        System.out.println(sb.toString());
    }
}