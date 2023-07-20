import java.util.*;

class Solution {
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public int solution(String[] board) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[board.length][board[0].length()];
        int[][] arr = new int[board.length][board[0].length()];
        int targetX = -1;
        int targetY = -1;

        for(int y = 0 ; y < board.length ; y++){
            for(int x = 0 ; x < board[0].length() ; x++){
                if(board[y].charAt(x) == 'R'){
                    queue.add(new int[]{x, y, 0});
                    visited[y][x] = true;
                }
                if(board[y].charAt(x) == 'G'){
                    targetX = x;
                    targetY = y;
                }
            }
        }

        while(queue.size() > 0){
            int[] cur = queue.poll();

            for(int i = 0 ; i < 4 ; i++){
                int[] next = move(board, cur, i);
                if(!visited[next[1]][next[0]]){
                    queue.add(next);
                    visited[next[1]][next[0]] = true;
                    if(arr[next[1]][next[0]] == 0){
                        arr[next[1]][next[0]] = next[2];
                    }
                    arr[next[1]][next[0]] = arr[next[1]][next[0]] > next[2] ? next[2] : arr[next[1]][next[0]];
                }
            }
        }

        return arr[targetY][targetX] == 0 ? -1 : arr[targetY][targetX];
    }

    public static int[] move(String[] board, int[] cur, int direction){
        int x = cur[0];
        int y = cur[1];
        int count = cur[2];

        //moveY
        if(direction % 2 == 0){
            while(y < board.length && y >= 0 && board[y].charAt(x) != 'D'){
                y += dy[direction];
            }
            y -= dy[direction];
        }
        //moveX
        else{
            while(x < board[0].length() && x >= 0 && board[y].charAt(x) != 'D'){
                x += dx[direction];
            }
            x -= dx[direction];
        }

        return new int[]{x, y, count + 1};
    }
}