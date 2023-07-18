import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        List<String> list;

        while(true){
            int count = Integer.parseInt(br.readLine());
            if(count == 0){
                break;
            }
            list = new ArrayList<>();
            for(int i = 0 ; i < count ; i++){
                list.add(br.readLine());
            }
            Collections.sort(list, (next, pre) -> {
                return next.toLowerCase().compareTo(pre.toLowerCase());
            });
            sb.append(list.get(0)).append("\n");
        }
        System.out.println(sb.toString());
    }
}