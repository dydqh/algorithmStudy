import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        List<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            list.add(new ArrayList<>());
            for(int j = 0 ; j < n ; j++){
                if(computers[i][j] == 1){
                    list.get(i).add(j);        
                }
            }
        }
        
        boolean[] isVisited = new boolean[n];
        int answer = 0;
        for(int i = 0 ; i < n ; i++){
            if(!isVisited[i]){
                answer++;
                isVisited[i] = true;
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                while(!queue.isEmpty()){
                    int cur = queue.poll();
                    for(int j = 0 ; j < list.get(cur).size() ; j++){
                        if(!isVisited[list.get(cur).get(j)]){
                            isVisited[list.get(cur).get(j)] = true;
                            queue.add(list.get(cur).get(j));
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}