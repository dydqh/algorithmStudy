import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int count = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < count ; i++){
            String curInput = br.readLine();
            if(curInput.equals("0")){
                Integer curNumber = priorityQueue.poll();
                sb.append(curNumber == null ? 0 : curNumber).append("\n");
            }
            else{
                priorityQueue.add(Integer.parseInt(curInput));
            }
        }

        System.out.println(sb.toString());
    }
}