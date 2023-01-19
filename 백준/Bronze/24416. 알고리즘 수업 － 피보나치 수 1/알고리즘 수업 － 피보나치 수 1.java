import java.io.*;

class Main{
    public static int fibCount = 0;
    public static int fibonacciCount = 0;
    public static int[] f;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        f = new int[N];

        fib(N);
        fibonacci(N);

        System.out.println(fibCount + " " + fibonacciCount);
    }

    public static int fib(int N){
        if(N == 1 || N == 2){
            fibCount += 1;
            return 1;
        }

        return fib(N - 1) + fib(N - 2);
    }

    public static int fibonacci(int N){
        f[0] = 1;
        f[1] = 1;

        for(int i = 2 ; i < N ; i++){
            fibonacciCount += 1;
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[N - 1];
    }
}