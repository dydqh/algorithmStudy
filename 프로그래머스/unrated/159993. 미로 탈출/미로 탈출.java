import java.util.*;

class Solution {
    public int solution(String[] maps) {
        int[] xy = new int[4];

        for(int y = 0 ; y < maps.length ; y++){
            for(int x = 0 ; x < maps[0].length() ; x++){
                if(maps[y].charAt(x) == 'S'){
                    xy[0] = x;
                    xy[1] = y;
                }
                if(maps[y].charAt(x) == 'E'){
                    xy[2] = x;
                    xy[3] = y;
                }
            }
        }

        return bfs(maps, xy);
    }

    public static int bfs(String[] maps, int[] xy){
        int startX = xy[0];
        int startY = xy[1];
        int endX = xy[2];
        int endY = xy[3];
        int[] dx = new int[]{0, -1, 0, 1};
        int[] dy = new int[]{1, 0, -1, 0};

        Queue<int[]> queue = new LinkedList<>();
        int[][] visited = new int[maps.length][maps[0].length()];
        int[][] arr = new int[maps.length][maps[0].length()];
        int visitedCount = 1;

        visited[startY][startX] = visitedCount;
        queue.add(new int[]{startX, startY, 0});

        while(queue.size() > 0){
            int[] cur = queue.poll();
            arr[cur[1]][cur[0]] = cur[2];

            if(maps[cur[1]].charAt(cur[0]) == 'L'){
                visitedCount++;
                visited[cur[1]][cur[0]] = visitedCount;
                queue.clear();
            }

            for(int i = 0 ; i < 4 ; i++){
                if(check(maps, cur[0] + dx[i], cur[1] + dy[i], visited, visitedCount)){
                    visited[cur[1] + dy[i]][cur[0] + dx[i]] = visitedCount;
                    queue.add(new int[]{cur[0] + dx[i], cur[1] + dy[i], cur[2] + 1});
                }
            }
        }

        return visited[endY][endX] == 2 ? arr[endY][endX] : -1;
    }

    public static boolean check(String[] maps, int x, int y, int[][] visited, int visitedCount){
        if(x < 0 || y < 0 || y >= maps.length || x >= maps[0].length() || maps[y].charAt(x) == 'X' || visited[y][x] >= visitedCount){
            return false;
        }
        
        return true;
    }
}