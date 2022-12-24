import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        boolean[] booleanList = new boolean[number + 1];
        List<Integer> primeList = new ArrayList<>();
        
        for(int i = 2 ; i < number + 1 ; i++){
            if(booleanList[i] == false){
                primeList.add(i);
                
                int start = 1;
                int prime = i;
                while(prime * start <= number){
                    booleanList[prime * start] = true;
                    start += 1;
                }
            }
        }
        
        for(int i = 0 ; i < number ; i++){
            Map<Integer, Integer> answerCount = new HashMap<>();
            
            if(i == 0){
                answer += 1;
            }
            else{
                int curNumber = i + 1;

                for(int j = 0 ; j < primeList.size() ; j++){
                    if(curNumber == 1){
                        break;
                    }

                    if(curNumber % primeList.get(j) == 0){
                        curNumber /= primeList.get(j);
                        if(!answerCount.containsKey(primeList.get(j))){
                            answerCount.put(primeList.get(j), 1);
                        }
                        else{
                            answerCount.put(primeList.get(j), answerCount.get(primeList.get(j)) + 1);
                        }
                        j -= 1;
                    }
                }

                int answerPart = 1;
                for(int answerCountKey : answerCount.keySet()){
                    answerPart *= (answerCount.get(answerCountKey) + 1);
                }
                if(answerPart > limit){
                    answer += power;
                }
                else{
                    answer += answerPart;
                }
            }
        }
        return answer;
    }
}