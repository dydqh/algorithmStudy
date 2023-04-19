import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        int count = Integer.parseInt(br.readLine());
        set.add("ChongChong");

        for(int i = 0 ; i < count ; i++){
            String[] input = br.readLine().split(" ");
            if(set.contains(input[0]) || set.contains(input[1])){
                set.add(input[0]);
                set.add(input[1]);
            }
        }

        System.out.println(set.size());
    }
}