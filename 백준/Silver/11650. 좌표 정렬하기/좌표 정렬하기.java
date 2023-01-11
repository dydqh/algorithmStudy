import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = Integer.parseInt(br.readLine());
        int[] x = new int[count];
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0 ; i < count ; i++){
            String[] input = br.readLine().split(" ");
            x[i] = Integer.parseInt(input[0]);
            int yItem = Integer.parseInt(input[1]);

            if(!map.containsKey(x[i])){
                List<Integer> y = new ArrayList<>();
                y.add(yItem);
                map.put(x[i], y);
            }
            else{
                List<Integer> y = map.get(x[i]);
                y.add(yItem);
                map.put(x[i], y);
            }
        }

        Arrays.sort(x);
        List<Integer> y = new ArrayList<>();
        int index = 0;

        for(int i = 0 ; i < count ; i++){
            if(i == 0){
                y = map.get(x[i]);
                Collections.sort(y);
                sb.append(x[i]).append(" ").append(y.get(index)).append("\n");
                index++;
            }
            else if(x[i - 1] == x[i]){
                sb.append(x[i]).append(" ").append(y.get(index)).append("\n");
                index++;
            }
            else{
                index = 0;
                y = map.get(x[i]);
                Collections.sort(y);
                sb.append(x[i]).append(" ").append(y.get(index)).append("\n");
                index++;
            }
        }

        System.out.println(sb.toString());
    }
}