import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long answer = 0;
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] numbers = new int[n];
        for(int i = 0 ; i < input.length ; i++){
            numbers[i] = Integer.parseInt(input[i]);
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                answer += (long)Math.abs(numbers[i] - numbers[j]);
            }
        }
        System.out.println(answer);
    }
}