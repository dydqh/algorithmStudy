import java.io.*;

class Main{
    public static int[][] dp;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        dp = new int[N + 1][K + 1];
        
        System.out.println(BC(N, K));
    }

    public static int BC(int N, int K){
        if(dp[N][K] > 0){
            return dp[N][K];
        }
        
        if(N == K || K == 0){
            return dp[N][K] = 1;
        }

        return dp[N][K] = (BC(N - 1, K - 1) + BC(N - 1, K));
    }
}