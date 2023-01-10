import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> primeSet = new HashSet<>();
        

        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                break;
            }
            boolean[] isPrime = new boolean[(2 * n + 1)];
            for(int i = 2 ; i <= (2 * n) ; i++){
                if(isPrime[i]){
                    continue;
                }
                primeSet.add(i);
                int target = i;
                int index = 1;
                while(target * index <= (2 * n)){
                    isPrime[target * index] = true;
                    index += 1;
                }
            }

            int[] tempList = primeSet.stream().filter(x -> (x > n && x <= (2 * n))).mapToInt(Integer::intValue).toArray();
            System.out.println(tempList.length);
        }
    }
}