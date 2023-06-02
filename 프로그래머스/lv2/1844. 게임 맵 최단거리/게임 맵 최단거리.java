import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int[] dx = new int[]{-1, 0, 1, 0};
        int[] dy = new int[]{0, -1, 0, 1};

        int m = maps.length;
        int n = maps[0].length;

        int[][] countMap = new int[m][n];
        boolean[][] visitedMap = new boolean[m][n];

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});

        while(queue.size() > 0){
            int[] curQueue = queue.poll();
            int curX = curQueue[0];
            int curY = curQueue[1];
            int curCount = curQueue[2];

            countMap[curY][curX] = curCount;

            for(int i = 0 ; i < 4 ; i++){
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];
                if(nextX < 0 || nextY < 0 || nextY >= m || nextX >= n){
                    continue;
                }
                else{
                    if(maps[nextY][nextX] != 0 && countMap[nextY][nextX] == 0 && !visitedMap[nextY][nextX]){
                        visitedMap[nextY][nextX] = true;
                        queue.add(new int[]{nextX, nextY, curCount + 1});
                    }
                }
            }
        }
        
        return countMap[m - 1][n - 1] == 0 ? -1 : countMap[m - 1][n - 1];
    }
}