import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] list = new int[]{
            Integer.parseInt(input[0]),
            Integer.parseInt(input[1]),
            Integer.parseInt(input[2]),
            Integer.parseInt(input[3]),
            Integer.parseInt(input[4])
        };
        Arrays.sort(list);
        int result = 1000000000;

        for(int i = 0 ; i < 3 ; i++){
            for(int j = i + 1 ; j < 4 ; j++){
                for(int k = j + 1 ; k < 5 ; k++){
                    int curGcd = gcd(list[k], list[j]);
                    int large = list[k] * list[j] / curGcd;
                    curGcd = gcd(large, list[i]);
                    int curResult = large * list[i] / curGcd;
                    result = result > curResult ? curResult : result;
                }
            }
        }
        
        System.out.println(result);
    }

    public static int gcd(int large, int small){
        if(large % small == 0){
            return small;
        }
        else{
            return gcd(small, large % small);
        }
    }
}