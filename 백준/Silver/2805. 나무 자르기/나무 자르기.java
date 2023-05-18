import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int count = Integer.parseInt(input[0]);
        int need = Integer.parseInt(input[1]);
        int[] trees = Arrays.stream(br.readLine().split(" ")).mapToInt(o -> Integer.parseInt(o)).sorted().toArray();

        int low = 0;
        int high = trees[count - 1];
        int mid = 0;

        while (low + 1 < high) {
            mid = (low + high) / 2;
            if (check(trees, need, mid)){
                low = mid;
            } 
            else {
                high = mid;
            }
        }
        
        System.out.println(low);
    }

    public static boolean check(int[] trees, int need, int mid){
        long sum = 0;
        for(int i = 0 ; i < trees.length ; i++){
            sum += trees[i] > mid ? trees[i] - mid : 0;
        }
        return sum >= need;
    }
}