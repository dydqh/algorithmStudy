import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long x = Long.parseLong(input[0]);
        long y = Long.parseLong(input[1]);
        long z = y * 100 / x;

        if(z >= 99){
            System.out.println(-1);
        }
        else{
            long start = 0;
            long end = (100 * y - (z + 1) * x) / (z - 99) + 1;
            long mid = 0;

            while(start + 1 < end){
                mid = (start + end) / 2;
                if((y + mid) * 100 / (x + mid) == z){
                    start = mid;
                }
                else{
                    end = mid;
                }
            }

            System.out.println(end);
        }
    }
}