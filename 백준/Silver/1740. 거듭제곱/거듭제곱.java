import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long result = 0;
        long level = 1;

        while(n > 0){
            if(n % 2 == 1){
                result += level;
            } 
            level *= 3;
            n /= 2;
        }

        System.out.println(result);
    }
}