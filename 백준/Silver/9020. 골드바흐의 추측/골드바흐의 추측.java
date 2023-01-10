import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        int size = 10000;

        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        boolean[] isPrime = new boolean[size+ 1];

        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2 ; i <= Math.sqrt(size) ; i++){
            if(!isPrime[i]){
                continue;
            }

            int target = i;
            int index = 2;
            while(target * index < (size + 1)){
                isPrime[target * index] = false;
                index += 1;
            }
        }

        for(int i = 0 ; i < count ; i++){
            int T = Integer.parseInt(br.readLine());
            int left = T / 2;
            int right = T / 2;
            while(true){
                if(isPrime[left] && isPrime[right]){
                    sb.append(left).append(" ").append(right).append("\n");
                    break;
                }
                left--;
                right++;
            }
        }

        System.out.println(sb.toString());
    }
}