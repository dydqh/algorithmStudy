import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int count = m;
        BigInteger answer = new BigInteger("1");
        for(int i = 0 ; i < count ; i++){
            answer = answer.multiply(new BigInteger(String.valueOf(n)));
            n--;
        }
        for(int i = 0 ; i < count ; i++){
            answer = answer.divide(new BigInteger(String.valueOf(m)));
            m--;
        }
        System.out.println(answer.toString());
    }
}