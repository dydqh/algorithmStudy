import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        int[] dx = new int[]{0, 1, -1};
        int[] dy = new int[]{1, 0, -1};
        int[][] tri = new int[n][n];
        int max = (n + 1) * n / 2;
        int number = 1;
        int y = 0;
        int x = 0;
        int dir = 0;

        while(number <= max){
            tri[y][x] = number++;

            if(dir == 0 && (y == tri.length - 1 || tri[y + dy[dir]][x + dx[dir]] > 0)){
                dir = 1;
            }
            if(dir == 1 && (x == tri[0].length - 1 || tri[y + dy[dir]][x + dx[dir]] > 0)){
                dir = 2;
            }
            if(dir == 2 && (y == 0 || tri[y + dy[dir]][x + dx[dir]] > 0)){
                dir = 0;
            }

            x += dx[dir];
            y += dy[dir];
        }

        for (int[] line : tri) {
            for (int item : line) {
                if (item == 0) {
                    break;
                }
                answer.add(item);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}