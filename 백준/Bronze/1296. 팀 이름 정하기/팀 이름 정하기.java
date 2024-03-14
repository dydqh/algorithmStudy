import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> LOVE = new ArrayList<>();
        LOVE.add("L");
        LOVE.add("O");
        LOVE.add("V");
        LOVE.add("E");
        String name = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String answer = "";
        int score = 0;
        for(int i = 0 ; i < n ; i++){
            int[] count = new int[97];
            String input = br.readLine();
            name.chars().forEach(o -> {if(LOVE.contains(String.valueOf((char)o))) count[o]++; });
            input.chars().forEach(o -> {if(LOVE.contains(String.valueOf((char)o))) count[o]++; });
            int L = count[(int)'L'];
            int O = count[(int)'O'];
            int V = count[(int)'V'];
            int E = count[(int)'E'];
            int curScore = ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;
            if(curScore > score){
                score = curScore;
                answer = input;
            }
            else if(curScore == score){
                List<String> temp = new ArrayList<>();
                if(!answer.equals("")) temp.add(answer);
                temp.add(input);
                Collections.sort(temp);
                answer = temp.get(0);
            }
        }
        System.out.println(answer);
    }
}