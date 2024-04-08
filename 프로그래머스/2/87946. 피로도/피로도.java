import java.util.*;

class Solution {
        int max = 0;
    
        int solution(int k, int[][] dungeons) {
            boolean[] visited = new boolean[dungeons.length];
            dfs(dungeons, k, visited, new ArrayList<>());
            return max;
        }

        void dfs(int[][] dungeons, int k, boolean[] visited, List<Integer> arr){
            max = Math.max(max, arr.size());

            if(k == 0 || arr.size() == dungeons.length){
                return;
            }
            
            for(int i = 0 ; i < dungeons.length ; i++){
                if(!visited[i]){
                    if(k >= dungeons[i][0]){
                        visited[i] = true;
                        arr.add(i);
                        dfs(dungeons, k - dungeons[i][1], visited, arr);
                        arr.remove(arr.indexOf(i));
                        visited[i] = false;
                    }
                }
            }
        }
    }