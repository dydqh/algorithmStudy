import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        for(int i = 0 ; i < 3 ; i++){
            int n = Integer.parseInt(br.readLine());
            BigInteger sum = new BigInteger("0");
            for(int j = 0 ; j < n ; j++){
                sum = sum.add(new BigInteger(br.readLine()));
            }

            if(sum.compareTo(new BigInteger("0")) == 1){
                sb.append("+").append("\n");
            }
            else if(sum.compareTo(new BigInteger("0")) == -1){
                sb.append("-").append("\n");
            }
            else{
                sb.append("0").append("\n");
            }
        }
        
        System.out.println(sb.toString());
    }
}