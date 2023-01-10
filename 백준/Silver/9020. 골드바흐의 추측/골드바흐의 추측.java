import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        List<Integer> primeList = new ArrayList<>();
        boolean[] isPrime = new boolean[10001];

        for(int i = 2 ; i < 10001 ; i++){
            if(isPrime[i]){
                continue;
            }

            primeList.add(i);
            int target = i;
            int index = 1;
            while(target * index < 10001){
                isPrime[target * index] = true;
                index += 1;
            }
        }

        for(int i = 0 ; i < count ; i++){
            int T = Integer.parseInt(br.readLine());
            // int[] tempList = primeList.stream().filter(x -> (x <= T / 2)).sorted().mapToInt(Integer::intValue).toArray();

            // for(int j = tempList.length - 1 ; j >= 0 ; j--){
            //     if(primeList.indexOf(T - tempList[j]) != -1){
            //         int min = tempList[j] > T - tempList[j] ? T - tempList[j] : tempList[j];
            //         int max = tempList[j] < T - tempList[j] ? T - tempList[j] : tempList[j];
            //         sb.append(min).append(" ").append(max).append("\n");
            //         break;
            //     }
            // }
            int left = T / 2;
            int right = T / 2;
            while(true){
                if((primeList.indexOf(left) != -1) && (primeList.indexOf(right) != -1)){
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