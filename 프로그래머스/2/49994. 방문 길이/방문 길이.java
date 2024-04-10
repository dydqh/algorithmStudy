class Solution {
        public static int curX = 5;
        public static int curY = 5;
        public static int answer = 0;

        public int solution(String dirs) {
            boolean[][][] visited = new boolean[11][11][4];
            int[] dy = new int[]{1, -1, 0, 0};
            int[] dx = new int[]{0, 0, 1, -1};
            int[] dir = new int[91];
            int[] rev = new int[91];
            dir['U'] = 0;
            rev['U'] = 1;
            dir['D'] = 1;
            rev['D'] = 0;
            dir['R'] = 2;
            rev['R'] = 3;
            dir['L'] = 3;
            rev['L'] = 2;

            for(int i = 0 ; i < dirs.length() ; i++){
                int dirChar = (int)dirs.charAt(i);
                move(visited, curX + dx[dir[dirChar]], curY + dy[dir[dirChar]], dir[dirChar], rev[dirChar]);
            }
            return answer;
        }

        public static void move(boolean[][][] visited, int nextX, int nextY, int dir, int rev){
            if(nextX >= 0 && nextY >= 0 && nextX < 11 && nextY < 11){
                if(!visited[curY][curX][dir]){
                    visited[curY][curX][dir] = true;
                    visited[nextY][nextX][rev] = true;
                    answer++;
                }
                curX = nextX;
                curY = nextY;
            }
        }
    }