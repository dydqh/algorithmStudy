import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] sum = new int[1001];
        int number = 1;
        int count = 1;
        for(int i = 1 ; i < 1001 ; i++){
            sum[i] = number + sum[i - 1];
            count--;
            if(count == 0){
                number++;
                count = number;
            }
        }
        String[] input = br.readLine().split(" ");
        System.out.println(sum[Integer.parseInt(input[1])] - sum[Integer.parseInt(input[0]) - 1]);
    }
}