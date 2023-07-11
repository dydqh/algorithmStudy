import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[n + 1];

        if(n == 1 || n == 2){
            System.out.println(1);
        }
        else{
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 1;

            for(int i = 3 ; i <= n ; i++){
                dp[i] = dp[i - 2] * 2 + dp[i - 3];
            }

            System.out.println(dp[n]);
        }
    }
}