import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> answer = new HashSet<>();
        List<Integer> prime = new ArrayList<>();
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2 ; i <= n ; i++){
            if(isPrime[i]){
                prime.add(i);
                int index = 2;
                while(i * index <= n){
                    isPrime[i * index] = false;
                    index++;
                }
            }
        }
        while(n > 1){
            for(int curPrime : prime){
                if(n % curPrime == 0){
                    n /= curPrime;
                    answer.add(curPrime);
                    break;
                }
            }
        }
        return answer.stream().sorted().mapToInt(i -> i).toArray();
    }
}