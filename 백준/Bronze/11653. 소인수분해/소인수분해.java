import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        List<Integer> primeList = new ArrayList<>();
        int size = (int)Math.ceil(Math.sqrt(N));
        boolean[] isPrime = new boolean[size + 1];

        for(int i = 2 ; i <= size ; i++){
            if(isPrime[i]){
                continue;
            }
            primeList.add(i);
            int target = i;
            int index = 1;
            while(target * index <= size){
                isPrime[target * index] = true;
                index += 1;
            }
        }

        for(int i = 0 ; i < primeList.size() ; i++){
            if(N % primeList.get(i) == 0){
                sb.append(primeList.get(i)).append("\n");
                N /= primeList.get(i);
                i--;
            }
        }
        if(N != 1){
            sb.append(N);
        }
        
        System.out.println(sb.toString());
    }
}