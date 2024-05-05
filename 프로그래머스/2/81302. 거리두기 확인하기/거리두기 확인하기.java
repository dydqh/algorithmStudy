import java.util.*;

class Solution {
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        boolean isPossible = true;

        for(int i = 0 ; i < places.length ; i++){
            isPossible = true;
            for(int j = 0 ; j < places[i].length ; j++){
                for(int k = 0 ; k < places[i][j].length() ; k++){
                    if(places[i][j].charAt(k) == 'P'){
                        isPossible = check(places[i], j, k);
                    }
                    if(!isPossible){
                        break;
                    }
                }
                if(!isPossible){
                    break;
                }
            }
            answer[i] = isPossible ? 1 : 0;
        }
        return answer;
    }

    public boolean check(String[] place, int row, int col){
        int[] dy = new int[]{1, 0, -1, 0};
        int[] dx = new int[]{0, 1, 0, -1};
        boolean[][] isVisited = new boolean[5][5];
        boolean result = true;
        Queue<int[]> queue = new LinkedList<>();
        isVisited[row][col] = true;
        queue.add(new int[]{row, col, 0});

        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            for(int i = 0 ; i < 4 ; i++){
                int nextRow = cur[0] + dy[i];
                int nextCol = cur[1] + dx[i];
                int nextDist = cur[2] + 1;

                if(nextRow < 0 || nextRow >= place.length){
                    continue;
                }
                if(nextCol < 0 || nextCol >= place[0].length()){
                    continue;
                }
                if(isVisited[nextRow][nextCol]){
                    continue;
                }
                if(nextDist > 2){
                    continue;
                }
                if(place[nextRow].charAt(nextCol) == 'P'){
                    result = false;
                    break;
                }
                if(place[nextRow].charAt(nextCol) == 'O'){
                    isVisited[nextRow][nextCol] = true;
                    queue.add(new int[]{nextRow, nextCol, nextDist});
                }
            }
            if(!result){
                break;
            }
        }
        return result;
    }
}