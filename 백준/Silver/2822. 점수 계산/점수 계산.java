import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        List<int[]> list = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        int result = 0;

        for(int i = 1 ; i <= 8 ; i++){
            int[] temp = new int[]{i, Integer.parseInt(br.readLine())};
            list.add(temp);
        }

        Collections.sort(list, (next, pre) -> {
            if(next[1] > pre[1]){
                return 1;
            }
            else if(next[1] < pre[1]){
                return -1;
            }
            else{
                if(next[0] > pre[0]){
                    return -1;
                }
                else if(next[0] < pre[0]){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        });

        for(int i = 7 ; i > 2 ; i--){
            result += list.get(i)[1];
            resultList.add(list.get(i)[0]);
        }

        Collections.sort(resultList);
        
        sb.append(result).append("\n");
        for(int i = 0 ; i < 5 ; i++){
            sb.append(resultList.get(i)).append(" ");
        }
        
        System.out.println(sb.toString());
    }
}