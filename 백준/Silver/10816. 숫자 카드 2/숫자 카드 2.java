import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        String[] inputN = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());
        String[] inputM = br.readLine().split(" ");
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < N ; i++){
            int temp = Integer.parseInt(inputN[i]);
            if(!map.containsKey(temp)){
                map.put(temp, 1);
            }
            else{
                map.put(temp, map.get(temp) + 1);
            }
        }

        for(int i = 0 ; i < M ; i++){
            int temp = Integer.parseInt(inputM[i]);
            if(!map.containsKey(temp)){
                sb.append("0 ");
            }
            else{
                sb.append(map.get(temp)).append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}