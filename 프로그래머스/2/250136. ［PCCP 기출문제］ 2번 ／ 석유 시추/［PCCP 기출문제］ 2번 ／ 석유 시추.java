import java.util.*;

class Solution {
    public int solution(int[][] land) {
        int curLevel = 0;
        int[][] level = new int[land.length][land[0].length];
        Map<Integer, Integer> size = new HashMap<>();
        size.put(0, 0);
        for(int y = 0 ; y < land.length ; y++){
            for(int x = 0 ; x < land[0].length ; x++){
                if(level[y][x] == 0){
                    if(land[y][x] == 1){
                        check(y, x, land, level, ++curLevel, size);
                    }
                }
            }
        }

        int max = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < land[0].length ; i++){
            for(int j = 0 ; j < land.length ; j++){
                set.add(level[j][i]);
            }
            int curMax = 0;
            for(int item : set){
                curMax += size.get(item);
            }
            max = Math.max(max, curMax);
            set.clear();
        }
        return max;
    }

    public static void check(int y, int x, int[][] land, int[][] level, int curLevel, Map<Integer, Integer> size){
        int[] dx = new int[]{-1, 0, 1, 0};
        int[] dy = new int[]{0, -1, 0, 1};
        int curSize = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{y, x});
        level[y][x] = curLevel;
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int curY = cur[0];
            int curX = cur[1];
            for(int i = 0 ; i < 4 ; i++){
                int nextY = curY + dy[i];
                int nextX = curX + dx[i];
                if(nextX >= 0 && nextY >= 0 && nextY < land.length && nextX < land[0].length){
                    if(level[nextY][nextX] == 0){
                        if(land[nextY][nextX] == 1){
                            curSize++;
                            queue.add(new int[]{nextY, nextX});
                            level[nextY][nextX] = curLevel;
                        }
                    }
                }
            }
        }
        size.put(curLevel, curSize);
    }
}