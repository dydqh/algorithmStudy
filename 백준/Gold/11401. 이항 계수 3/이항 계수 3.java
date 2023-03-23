import java.io.*;

class Main{
    public static int modValue = 1000000007;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long N = Long.parseLong(input[0]);
        long K = Long.parseLong(input[1]);

        if(N == K || K == 0){
            System.out.println(1);
        }
        else{
            long child = factorialMod(N);
            long parent = factorialMod(K) * factorialMod(N - K);
    
            long divideSquareModResult = divideSquareMod(parent, modValue - 2);
    
            System.out.println((child * (divideSquareModResult % modValue)) % modValue);
        }
    }

    public static long factorialMod(long N){
        long fac = N;

        while(N > 1){
            N--;
            fac = fac * N % modValue;
        }

        return fac % modValue;
    }

    public static long divideSquareMod(long base, long square){
        if(square == 1){
            return base % modValue;
        }

        long temp = divideSquareMod(base, square / 2);

        if(square % 2 == 1){
            return ((temp * temp % modValue) * (base % modValue)) % modValue;
        }
        else{
            return temp * temp % modValue;
        }
    }
}