import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseCount = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < caseCount ; i++){
            Queue<int[]> ready = new LinkedList<>();
            int curResult = 0;
            String[] input = br.readLine().split(" ");
            int m = Integer.parseInt(input[0]);
            int n = Integer.parseInt(input[1]);
            int k = Integer.parseInt(input[2]);
            int[][] zone = new int[n][m];

            for(int j = 0 ; j < k ; j++){
                String[] location = br.readLine().split(" ");
                int x = Integer.parseInt(location[0]);
                int y = Integer.parseInt(location[1]);
                zone[y][x] = -1;
                ready.add(new int[]{y, x});
            }

            while(ready.size() > 0){
                int[] cur = ready.poll();
                if(zone[cur[0]][cur[1]] == -1){
                    zoning(cur[0], cur[1], zone, ++curResult);
                }
            }

            sb.append(curResult).append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void zoning(int y, int x, int[][] zone, int curResult){
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{y, x});
        while(queue.size() > 0){
            int[] cur = queue.poll();
            zone[cur[0]][cur[1]] = curResult;
            for(int i = 0 ; i < 4 ; i++){
                int nextY = cur[0] + dy[i];
                int nextX = cur[1] + dx[i];
                if(nextY >= 0 && nextX >= 0 && nextY < zone.length && nextX < zone[0].length && zone[nextY][nextX] == -1){
                    zone[nextY][nextX] = curResult;
                    queue.add(new int[]{nextY, nextX});
                }
            }
        }
    }
}