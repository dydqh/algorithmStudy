import java.util.*;

class Solution {
    public int[] solution(String s) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int target = 0;

        for(int i = 0 ; i < s.length() - 1 ; i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                target = target * 10 + s.charAt(i) - 48;
            }
            else if(s.charAt(i) == ',' && target > 0){
                stack.push(target);
                target = 0;
            }
            else if(s.charAt(i) == '}'){
                stack.push(target);
                target = 0;
                int key = stack.size();
                max = key > max ? key : max;
                Set<Integer> tempSet = new HashSet<>();
                while(stack.size() > 0){
                    tempSet.add(stack.pop());
                }
                map.put(key, tempSet);
            }
        }

        int[] answer = new int[max];

        for(int i = max ; i > 1 ; i--){
            Set<Integer> curSet = map.get(i);
            Iterator<Integer> nextSetIter = map.get(i - 1).iterator();

            while(nextSetIter.hasNext()){
                curSet.remove(nextSetIter.next());
            }
            answer[i - 1] = curSet.iterator().next();
        }

        answer[0] = map.get(1).iterator().next();
        
        return answer;
    }
}