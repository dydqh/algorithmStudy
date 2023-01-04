import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = Integer.parseInt(br.readLine());
        int[] targets = new int[count];
        String[] inputs = br.readLine().split(" ");
        
        for(int i = 0 ; i < count ; i++){
            targets[i] = Integer.parseInt(inputs[i]);    
        }
        
        int[] targets_new = Arrays.stream(targets).sorted().toArray();
        sb.append(targets_new[0]).append(" ").append(targets_new[count - 1]);
        System.out.println(sb.toString());
    }
}