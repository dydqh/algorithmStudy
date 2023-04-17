import java.io.*;
import java.math.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int caseCount = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < caseCount ; i++){
            long n = Long.parseLong(br.readLine());
            BigInteger bi = new BigInteger(String.valueOf(n));

            if(bi.isProbablePrime(10)){
                sb.append(n).append("\n");
            }
            else{
                sb.append(bi.nextProbablePrime()).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}