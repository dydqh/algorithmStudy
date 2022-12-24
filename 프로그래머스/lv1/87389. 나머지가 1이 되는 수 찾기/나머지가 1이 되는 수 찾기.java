import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] primeBoolList = new boolean[n + 1];
        List<Integer> primeList = new ArrayList<>();
        
        for(int i = 2 ; i < n ; i++){
            if(primeBoolList[i] == false){
                primeList.add(i);
                
                int target = i;
                int start = 1;
                while((target * start) <= n){
                    primeBoolList[target * start] = true;
                    start *= 2;
                }
            }
        }
        
        for(int i = 0 ; i < primeList.size() ; i++){
            if((n - 1) % primeList.get(i) == 0){
                answer = primeList.get(i);
                break;
            }
        }
        
        return answer;
    }
}