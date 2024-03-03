import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] one = s.split("1");
        String[] zero = s.split("0");
        int oneCount = 0;
        int zeroCount = 0;
        for(String o : one){
            if(!o.equals("")){
                oneCount++;
            }
        }
        for(String z : zero){
            if(!z.equals("")){
                zeroCount++;
            }
        }
        System.out.println(Math.min(oneCount, zeroCount));
    }
}