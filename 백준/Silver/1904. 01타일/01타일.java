import java.io.*;

class Main{
    public static long[] tileValue = new long[1000001];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(tile(N));
    }

    public static long tile(int N){
        tileValue[1] = 1;
        tileValue[2] = 2;

        for(int i = 3 ; i <= N ; i++){
            tileValue[i] = (tileValue[i - 1] + tileValue[i - 2]) % 15746;
        }

        return tileValue[N];
    }
}