import java.util.*;

class Solution {
    public int solution(int N, int[][] road, int K) {
        int[][] arr = new int[N][N];

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(i != j){
                    arr[i][j] = 2000000000;
                }
            }
        }

        for(int i = 0 ; i < road.length ; i++){
            int[] curInfo = road[i];
            if(arr[curInfo[0] - 1][curInfo[1] - 1] > curInfo[2]){
                arr[curInfo[0] - 1][curInfo[1] - 1] = curInfo[2];
                arr[curInfo[1] - 1][curInfo[0] - 1] = curInfo[2];
            }
        }

        Queue<int[]> queue = new PriorityQueue<>((next, pre) -> {
            return next[1] - pre[1];
        });

        for(int i = 0 ; i < N ; i++){
            queue.add(new int[]{i + 1, arr[0][i]});
        }
        
        boolean[] visited = new boolean[N];
        int[] result = new int[N];
        for(int i = 0 ; i < N ; i++){
            result[i] = 2000000000;
        }

        while(queue.size() > 0){
            int[] curPoint = queue.poll();
            int curStart = curPoint[0] - 1;
            int curTime = curPoint[1];

            if(!visited[curStart]){
                visited[curStart] = true;
                for(int i = 0 ; i < N ; i++){
                    if(result[i] > curTime + arr[curStart][i]){
                        result[i] = curTime + arr[curStart][i];
                        queue.add(new int[]{i + 1, curTime + arr[curStart][i]});
                    }
                }
            }
        }
        
        int answer = 0;
        for(int i = 0 ; i < result.length ; i++){
            if(result[i] <= K){
                answer++;
            }
        }

        return answer;
    }
}