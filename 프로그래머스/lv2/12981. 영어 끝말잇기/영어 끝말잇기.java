import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        List<String> list = new ArrayList<>();
        int person = 1;
        int[] answer = new int[2];
        
        for(int i = 0 ; i < words.length ; i++){
            if(i > 0 && words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)){
                answer[0] = person;
                answer[1] = i / n + 1;
                break;
            }
            else if(list.indexOf(words[i]) == -1){
                list.add(words[i]);
                person += 1;
                
                if(person > n){
                    person -= n;
                }
            }
            else{
                answer[0] = person;
                answer[1] = i / n + 1;
                break;
            }
        }

        return answer;
    }
}