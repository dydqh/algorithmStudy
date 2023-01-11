import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for(int i = 0 ; i < count ; i++){
            list.add(br.readLine());
        }

        Collections.sort(list);
        Collections.sort(list, (a, b) -> a.length() - b.length());
        list = list.stream().distinct().collect(Collectors.toList());

        for(int i = 0 ; i < list.size() ; i++){
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb.toString());
    }
}