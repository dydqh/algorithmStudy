import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        String[] input = br.readLine().split(" ");
        
        for(int i = 0 ; i < count ; i++){
            int temp = Integer.parseInt(input[i]);
            
            if(!map.containsKey(temp)){
                map.put(temp, 1);
            }
            else{
                int tempCount = map.get(temp);
                map.put(temp, tempCount + 1);
            }
        }
        
        int result = Integer.parseInt(br.readLine());
        if(map.containsKey(result)){
            System.out.println(map.get(result));
        }
        else{
            System.out.println(0);
        }
    }
}