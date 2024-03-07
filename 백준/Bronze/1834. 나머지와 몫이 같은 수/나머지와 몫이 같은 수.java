import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        BigInteger answer = new BigInteger("0");
        for(int i = 1 ; i < n ; i++){
            long cur = i * n + i;
            answer = answer.add(new BigInteger(String.valueOf(cur)));
        }
        System.out.println(answer.toString());
    }
}