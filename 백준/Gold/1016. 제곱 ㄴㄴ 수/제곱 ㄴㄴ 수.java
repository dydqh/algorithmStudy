import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long min = Long.parseLong(input[0]);
        long max = Long.parseLong(input[1]);
        Set<Long> set = new HashSet<>();
        boolean[] isPrime = new boolean[1000001];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2 ; i < 1000001 ; i++){
            if(!isPrime[i]){
                continue;
            }
            int index = 2;
            while(i * index < 1000001){
                isPrime[i * index] = false;
                index++;
            }
        }
        int size = (int)Math.sqrt(max);
        for(int i = 2 ; i <= size ; i++){
            if(!isPrime[i]){
                continue;
            }
            long target = (long)i * (long)i;
            long index = (min - 1) / target + 1;
            while(target * index <= max){
                set.add(target * index);
                index++;
            }
        }
        System.out.println(max - min + 1 - set.size());
    }
}