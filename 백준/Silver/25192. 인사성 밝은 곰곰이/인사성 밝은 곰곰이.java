import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        int result = 0;

        for(int i = 0 ; i < count ; i++){
            String input = br.readLine();
            if(input.equals("ENTER")){
                result += set.size();
                set = new HashSet<>();
                continue;
            }
            set.add(input);
        }

        result += set.size();
        System.out.println(result);
    }
}