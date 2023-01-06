import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i < count ; i++){
            String input = br.readLine();
            int score = 0;
            int tempScore = 0;

            for(int j = 0 ; j < input.length() ; j++){
                if(input.charAt(j) == 'O'){
                    tempScore += 1;
                    score += tempScore;
                }
                else{
                    tempScore = 0;
                    score += tempScore;
                }
            }

            sb.append(score).append('\n');
        }

        System.out.println(sb.toString());
    }
}