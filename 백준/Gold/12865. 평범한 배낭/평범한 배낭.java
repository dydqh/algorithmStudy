import java.io.*;
import java.util.*;

public class Main {
    public static boolean[] isVisited;
    public static List<int[]> list = new ArrayList<>();
    public static int maxWeight = 0;
    public static int[] dp;
    public static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int count = Integer.parseInt(input[0]);
        maxWeight = Integer.parseInt(input[1]);
        isVisited = new boolean[count];
        dp = new int[maxWeight + 1];

        for(int i = 0 ; i < count ; i++){
            input = br.readLine().split(" ");
            int weight = Integer.parseInt(input[0]);
            int value = Integer.parseInt(input[1]);
            list.add(new int[]{weight, value});
        }

        for(int i = 0 ; i < count ; i++){
            dfs(0, count, 0, 0, i);
        }
        
        System.out.println(max);
    }

    public static void dfs(int depth, int count, int curWeight, int curValue, int start){
        if(curWeight >= dp.length){
            return;
        }
        if(dp[curWeight] == 0 || dp[curWeight] < curValue){
            dp[curWeight] = curValue;
            max = max > curValue ? max : curValue;
        }
        else{
            return;
        }
        if(depth == count){
            return;
        }

        for(int i = start ; i < count ; i++){
            if(!isVisited[i]){
                isVisited[i] = true;
                dfs(depth + 1, count, curWeight + list.get(i)[0], curValue + list.get(i)[1], start);
                isVisited[i] = false;
            }
        }
    }
}