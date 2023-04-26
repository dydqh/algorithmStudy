import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            if(abs1 == abs2){
                return o1 > o2 ? 1 : -1;
            }
            else{
                return abs1 - abs2;
            }
        });

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