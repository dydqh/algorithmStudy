import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] list = new int[count];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < count ; i++){
            list[i] = Integer.parseInt(input[i]);
        }        

        int[] sortedList = Arrays.stream(list).sorted().boxed().mapToInt(Integer::intValue).toArray();
        int rank = 0;
        for(int i = 0 ; i < count ; i++){
            if(i == 0){
                map.put(sortedList[i], rank);
                rank++;
            }
            else if(sortedList[i] != sortedList[i - 1]){
                map.put(sortedList[i], rank);
                rank++;
            }
        }

        for(int i = 0 ; i < count ; i++){
            sb.append(map.get(list[i])).append(" ");
        }

        System.out.println(sb.toString());
    }
}