import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int min = Integer.parseInt(input[0]);
        int max = Integer.parseInt(input[1]);
        boolean[] isPrime = new boolean[max + 1];
        List<Integer> primeList = new ArrayList<>();
        int result = 0;
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2 ; i <= max ; i++){
            if(!isPrime[i]){
                continue;
            }

            primeList.add(i);
            int index = 2;
            while(i * index <= max){
                isPrime[i * index] = false;
                index++;
            }
        }

        for(int i = min ; i <= max ; i++){
            int curNumber = i;
            int curCount = 0;
            int primeListIndex = 0;

            while(curNumber > 1 && primeListIndex < primeList.size()){
                int curPrime = primeList.get(primeListIndex);
                if(curNumber % curPrime == 0){
                    curNumber /= curPrime;
                    curCount++;
                }
                else{
                    primeListIndex++;
                }
            }

            if(isPrime[curCount]){
                result++;
            }
        }

        System.out.println(result);
    }   
}