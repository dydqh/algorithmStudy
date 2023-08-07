import java.io.*;

public class Main {
    public static long[] dp;
    public static int index = 1;
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dp = new long[n + 1];

        for(int i = 0 ; i < Math.min(10, n) ; i++){
            dp[index] = i;
            index++;
        }

        for(int i = 1 ; i < 10 ; i++){
            for(int j = i ; j < 10 ; j++){
                dfs(j, i + 1, String.valueOf(j));
            }
        }

        if(n == 1){
            System.out.println(0);
        }
        else if(dp[n] == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(dp[n]);
        }
    }

    public static void dfs(int cur, int length, String value){
        if(index > n){
            return;
        }

        if(value.length() >= length){
            dp[index] = Long.parseLong(value);
            index++;
            return;
        }

        for(int i = length - 1 - value.length() ; i < cur ; i++){
            dfs(i, length, value + String.valueOf(i));
        }
    }
}