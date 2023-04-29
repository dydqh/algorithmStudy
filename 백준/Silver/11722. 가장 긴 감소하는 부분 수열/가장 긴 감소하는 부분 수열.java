import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        int[] list = new int[N];
        int[] dp = new int[N];
        int max = 0;
        
        for(int i = 0 ; i < N ; i++){
            list[i] = Integer.parseInt(numbers[i]);
        }

        for(int i = 0; i < N; i++) {
            dp[i] = 1;

            for(int j = 0; j < i; j++) {
                if(list[j] > list[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
            
            max = max > dp[i] ? max : dp[i];
        }

        System.out.println(max);
    }
}