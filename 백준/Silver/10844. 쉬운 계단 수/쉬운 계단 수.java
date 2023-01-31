import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[][] stairsCount = new long[N + 1][10];
        long mod = 1000000000;

        for(int i = 1; i <= 9 ; i++){
            stairsCount[1][i] = 1;
        }

        for(int i = 2 ; i <= N ; i++){
            stairsCount[i][0] = stairsCount[i - 1][1] % mod;
            stairsCount[i][9] = stairsCount[i - 1][8] % mod;

            for(int j = 1; j < 9 ; j++){
                stairsCount[i][j] = (stairsCount[i - 1][j + 1] + stairsCount[i - 1][j - 1]) % mod;
            }
        }

        long result = 0;
        for(int i = 0 ; i <= 9 ; i++){
            result += stairsCount[N][i];
        }

        System.out.println(result % mod);
    }
}