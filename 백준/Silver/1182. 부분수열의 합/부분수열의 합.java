import java.io.*;
import java.util.*;

public class Main {
    public static int answer = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int[] numbers = new int[n];
        for(int i = 0 ; i < n ; i++){
            numbers[i] = Integer.parseInt(input[i]);
        }
        for(int i = 0 ; i < n ; i++){
            List<Integer> arr = new ArrayList<>();
            arr.add(i);
            dfs(n, i + 1, arr, s, numbers);
        }

        System.out.println(answer);
    }

    public static void dfs(int n, int start, List<Integer> arr, int s, int[] numbers){
        int sum = 0;
        for (int i : arr) {
            sum += numbers[i];
        }
        if(sum == s){
            answer++;
        }

        if(start == n){
            return;
        }

        for(int i = start ; i < n ; i++){
            arr.add(i);
            dfs(n, i + 1, arr, s, numbers);
            arr.remove(arr.indexOf(i));
        }
    }
}