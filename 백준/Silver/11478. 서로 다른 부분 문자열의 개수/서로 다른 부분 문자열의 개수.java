import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        String input = br.readLine();

        for(int i = 0; i < input.length() ; i++){
            for(int j = i + 1 ; j <= input.length() ; j++){
                set.add(input.substring(i, j));
            }
        }

        System.out.println(set.size());
    }
}