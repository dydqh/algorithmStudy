import java.io.*;
import java.math.BigInteger;

public class Main {
    public static StringBuffer pubSb = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger count = BigInteger.ONE;

        for(int i = 0 ; i < n - 1 ; i++){
            count = count.multiply(BigInteger.valueOf(2));
            count = count.add(BigInteger.ONE);
        }

        System.out.println(count);

        if(n <= 20){
            hanoi(n, 1, 2, 3);
            System.out.println(pubSb.toString());
        }
    }

    public static void hanoi(int n, int start, int mid, int end){
        if(n == 1){
            pubSb.append(start).append(" ").append(end).append("\n");
            return;
        }

        hanoi(n - 1, start, end, mid);
        pubSb.append(start).append(" ").append(end).append("\n");
        hanoi(n - 1, mid, start, end);
    }
}