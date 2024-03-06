import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] count = new int[123];
        Set<Character> set = new HashSet<>();
        for(int i = 0 ; i < n ; i++){
            char cur = br.readLine().charAt(0);
            count[cur]++;
            if(count[cur] >= 5){
                set.add(cur);
            }
        }
        List<Character> answer = new ArrayList<>(set);
        Collections.sort(answer);
        if(set.isEmpty()){
            sb.append("PREDAJA");
        }
        for(char ch : answer){
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}