import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[n + 1];
        dp[2] = 2;
        for(int i = 3 ; i <= n ; i++){
            dp[i] = i * dp[i - 1];
            while(dp[i] % 10 == 0){
                dp[i] /= 10;
            }
            dp[i] %= 1000000000000l;
        }
        
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < 5 ; i++){
            sb.append(dp[n] % 10);
            dp[n] /= 10;
        }
        System.out.println(sb.reverse().toString());
    }
}