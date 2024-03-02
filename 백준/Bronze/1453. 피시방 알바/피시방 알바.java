import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        Set<String> set = new HashSet<>();
        for(String place : input){
            set.add(place);
        }
        System.out.println(n - set.size());
    }
}