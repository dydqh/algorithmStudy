import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = 1;
        int time = 0;
        while(n > 0){
            if(n < k) k = 1;
            n -= k;
            k++;
            time++;
        }
        System.out.println(time);
    }
}