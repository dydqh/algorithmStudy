import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = Integer.parseInt(br.readLine());
        int myScore = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 1 ; i < n ; i++){
            pq.add(Integer.parseInt(br.readLine()));
        }
        
        if(pq.size() > 0){
            while(myScore <= pq.peek()){
                int cur = pq.poll();
                cur--;
                myScore++;
                result++;
                pq.add(cur);
            }
        }

        System.out.println(result);
    }
}