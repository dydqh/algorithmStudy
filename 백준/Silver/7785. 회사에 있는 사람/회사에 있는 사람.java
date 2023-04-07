import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        Set<String> set = new HashSet<>();
        int count = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < count ; i++){
            String[] input = br.readLine().split(" ");
            if(input[1].equals("enter")){
                set.add(input[0]);
            }
            else if(input[1].equals("leave")){
                set.remove(input[0]);
            }
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        for(int i = list.size() - 1 ; i >= 0 ; i--){
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb.toString());
    }
}