class Solution {
    public int[][] solution(int n) {
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        int[][] answer = new int[n][n];
        int number = 1;
        int curX = 0;
        int curY = 0;
        int direction = 0;

        answer[curY][curX] = number;
        while(number < n * n){
            for(int i = direction ; i < direction + 4 ; i++){
                if(check(answer, curX + dx[i % 4], curY + dy[i % 4])){
                    direction = i % 4;
                    curX = curX + dx[i % 4];
                    curY = curY + dy[i % 4];
                    answer[curY][curX] = ++number;
                    break;
                }
            }
        }
        return answer;
    }

    public boolean check(int[][] array, int nextX, int nextY){
        boolean result = false;
        if(nextY < array.length && nextX < array[0].length && nextY >= 0 && nextX >= 0){
            if(array[nextY][nextX] == 0){
                result = true;
            }
        }
        return result;
    }
}