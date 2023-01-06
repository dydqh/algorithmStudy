import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        double[] scoreList = new double[count];
        for(int i = 0 ; i < count ; i++){
            scoreList[i] = Double.parseDouble(input[i]);
        }
        Arrays.sort(scoreList);
        double M = scoreList[count - 1];
        double result = 0;
        
        for(int i = 0 ; i < count ; i++){
            scoreList[i] = scoreList[i] / M * 100;
            result += scoreList[i];
        }
        
        System.out.println(result / count);
    }
}