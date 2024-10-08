import java.util.*;

class Solution {
    public int solution(int[][] points, int[][] routes) {
        int answer = 0;
        int[][] map = new int[101][101];
        int curLevel = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < routes.length; i++) {
            int[] route = routes[i];
            int[] start = points[route[0] - 1];
            int[] end = points[route[1] - 1];
            int endIndex = 1;
            map[start[0]][start[1]]++;
            queue.add(new int[]{start[0], start[1], end[0], end[1], endIndex, i, 0});
            if (map[start[0]][start[1]] == 2) {
                answer++;
            }
        }
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            if(cur[6] == curLevel){
                curLevel++;
                map = new int[101][101];
            }
            cur[6]++;

            if(cur[0] != cur[2]){
                if(cur[0] > cur[2]){
                    cur[0]--;
                }
                else{
                    cur[0]++;
                }
            }
            else if(cur[1] != cur[3]){
                if(cur[1] > cur[3]){
                    cur[1]--;
                }
                else{
                    cur[1]++;
                }
            }

            map[cur[0]][cur[1]]++;
            if (map[cur[0]][cur[1]] == 2) {
                answer++;
            }

            if(cur[0] == cur[2] && cur[1] == cur[3]){
                if(routes[cur[5]].length - 1 > cur[4]){
                    cur[0] = points[routes[cur[5]][cur[4]] - 1][0];
                    cur[1] = points[routes[cur[5]][cur[4]] - 1][1];
                    cur[4]++;
                    cur[2] = points[routes[cur[5]][cur[4]] - 1][0];
                    cur[3] = points[routes[cur[5]][cur[4]] - 1][1];
                    queue.add(cur);
                }
            }
            else{
                queue.add(cur);
            }
        }
        return answer;
    }
}