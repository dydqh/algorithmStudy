import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Long> queue = new PriorityQueue<>();
        String[] input = br.readLine().split(" ");
        int k = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int[] numbers = new int[k];

        for(int i = 0 ; i < k ; i++){
            numbers[i] = Integer.parseInt(input[i]);
            queue.add(Long.parseLong(input[i]));
        }

        long curNumber = 0;

        for(int i = 0 ; i < n ; i++){
            curNumber = queue.poll();
            for(int j = 0 ; j < k ; j++){
                long target = curNumber * numbers[j];
                queue.add(target);
                if (curNumber % numbers[j] == 0) {
                    break;
                }
            }
        }

        System.out.println(curNumber);
    }
}