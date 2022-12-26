import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        StringBuffer sb = new StringBuffer();

        int size = Integer.parseInt(br.readLine());

        while(true){
            int packet = Integer.parseInt(br.readLine());
            if(packet == -1){
                break;
            }

            if(packet != 0){
                if(queue.size() < size){
                    queue.add(packet);
                }
            }
            else{
                queue.poll();
            }
        }

        if(queue.size() == 0){
            System.out.println("empty");
        }
        else{
            while(queue.size() > 0){
                sb.append(queue.poll() + " ");
            }
    
            sb.deleteCharAt(sb.length()-1);
    
            System.out.println(sb.toString());
        }
    }
}