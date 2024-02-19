import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new HashSet<>();
        for(int i = 2 ; i <= n ; i++){
            if(n % i == 0){
                n /= i;
                set.add(i);
                i--;
            }
        }
        return set.stream().sorted().mapToInt(i -> i).toArray();
    }
}