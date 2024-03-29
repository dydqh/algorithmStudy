import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int result = 0;

        while(x > 0){
            result += (x % 2);
            x /= 2;
        }

        System.out.println(result);
    }
}