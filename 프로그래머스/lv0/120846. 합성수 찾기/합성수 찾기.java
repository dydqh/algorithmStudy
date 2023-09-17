import java.util.*;

class Solution {
    public int solution(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        int result = n - 1;
        for(int i = 2 ; i <= n ; i++){
            if(!isPrime[i]){
                continue;
            }
            result--;
            int number = i;
            int index = 2;
            while(number * index <= n){
                isPrime[number * index] = false;
                index++;
            }
        }
        return result;
    }
}