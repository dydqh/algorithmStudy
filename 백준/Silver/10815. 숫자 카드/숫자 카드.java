import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int hasCount = Integer.parseInt(br.readLine());
        String[] hasList = br.readLine().split(" ");
        Map<String, Boolean> map = new HashMap<>();

        for(int i = 0 ; i < hasCount ; i++){
            if(!map.containsKey(hasList[i])){
                map.put(hasList[i], true);
            }
        }

        int count = Integer.parseInt(br.readLine());
        String[] list = br.readLine().split(" ");

        for(int i = 0 ; i < count ; i++){
            if(map.containsKey(list[i])){
                sb.append("1 ");
            }
            else{
                sb.append("0 ");
            }
        }

        System.out.println(sb.toString());
    }
}