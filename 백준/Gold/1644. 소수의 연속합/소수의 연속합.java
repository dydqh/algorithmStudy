import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] isPrime = new boolean[n + 1];
        long[] sum = new long[n + 1];
        int sumIndex = 0;
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2 ; i <= n ; i++){
            if(!isPrime[i]){
                continue;
            }
            else{
                if(sumIndex > 0){
                    sum[sumIndex] = i + sum[sumIndex - 1];
                }
                else{
                    sum[sumIndex] = i;
                }
                sumIndex++;
                int cur = i;
                int index = 2;
                while(cur * index <= n){
                    isPrime[cur * index] = false;
                    index++;
                }
            }
        }

        int startIndex = 0;
        int endIndex = 0;
        int result = 0;

        while(sum[endIndex] > 0){
            if(sum[endIndex] < n){
                endIndex++;
            }
            else if(sum[endIndex] == n){
                result++;
                endIndex++;
            }
            else{
                if(sum[endIndex] - sum[startIndex] == n){
                    result++;
                    endIndex++;
                }
                else if(sum[endIndex] - sum[startIndex] < n){
                    endIndex++;
                }
                else{
                    startIndex++;
                }
            }
        }

        System.out.println(result);
    }
}