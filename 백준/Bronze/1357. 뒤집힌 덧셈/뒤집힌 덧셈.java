import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);

        int result = Rev(Rev(x) + Rev(y));
        System.out.println(result);
    }

    public static int Rev(int x){
        int result = 0;

        if(x >= 1000){
            result += (x % 10) * 1000;
            x /= 10;
            result += (x % 10) * 100;
            x /= 10;
            result += (x % 10) * 10;
            x /= 10;
            result += x;
            return result;
        }
        else if(x >= 100){
            result += (x % 10) * 100;
            x /= 10;
            result += (x % 10) * 10;
            x /= 10;
            result += x;
            return result;
        }
        else if(x >= 10){
            result += (x % 10) * 10;
            x /= 10;
            result += x;
            return result;
        }
        else{
            return x;
        }
    }
}