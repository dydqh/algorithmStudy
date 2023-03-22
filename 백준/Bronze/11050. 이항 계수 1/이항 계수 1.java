import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        System.out.println(BC(N, K));
    }

    public static int BC(int N, int K){
        if(N == K || K == 0){
            return 1;
        }

        return BC(N - 1, K - 1) + BC(N - 1, K);
    }
}