import java.io.*;

class Main{
    public static int[] dp = new int[41];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int caseCount = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < caseCount ; i++){
            int n = Integer.parseInt(br.readLine());

            if(n == 0){
                sb.append(1).append(" ").append(0).append("\n");
            }
            else{
                fibonacci(n);
                sb.append(dp[n - 1]).append(" ").append(dp[n]).append("\n");
            }
        }

        System.out.println(sb.toString());
    }

    public static int fibonacci(int n){
        if(dp[n] > 0){
            return dp[n];
        }
        
        if(n == 0){
            return dp[0] = 0;
        }
        else if(n == 1){
            return dp[1] = 1;
        }
        else{
            return dp[n] = fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
}