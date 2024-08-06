import java.util.*;

import java.util.*;

class Solution {
    public List<Integer> solution(String[] grid) {
        // [T -> B:0], [R -> L:1], [B -> T:2], [L -> R:3]
        List<Integer> answer = new ArrayList<>();
        boolean[][][] isVisited = new boolean[grid.length][grid[0].length()][4];
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length() ; j++){
                for(int k = 0 ; k < 4 ; k++){
                    if(!isVisited[i][j][k]){
                        answer.add(move(grid, isVisited, i, j, k));
                    }
                }
            }
        }
        Collections.sort(answer);
        return answer;
    }

    public static int move(String[] grid, boolean[][][] isVisited, int row, int col, int dir){
        int count = 0;
        while(!isVisited[row][col][dir]){
            count++;
            isVisited[row][col][dir] = true;
            if(dir == 0){
                row++;
                if(row >= isVisited.length){
                    row = 0;
                }
                if(grid[row].charAt(col) == 'L'){
                    dir = 3;
                }
                else if(grid[row].charAt(col) == 'R'){
                    dir = 1;
                }
            }
            else if(dir == 1){
                col--;
                if(col < 0){
                    col = isVisited[0].length - 1;
                }
                if(grid[row].charAt(col) == 'L'){
                    dir = 0;
                }
                else if(grid[row].charAt(col) == 'R'){
                    dir = 2;
                }
            }
            else if(dir == 2){
                row--;
                if(row < 0){
                    row = isVisited.length - 1;
                }
                if(grid[row].charAt(col) == 'L'){
                    dir = 1;
                }
                else if(grid[row].charAt(col) == 'R'){
                    dir = 3;
                }

            }
            else{
                col++;
                if(col >= isVisited[0].length){
                    col = 0;
                }
                if(grid[row].charAt(col) == 'L'){
                    dir = 2;
                }
                else if(grid[row].charAt(col) == 'R'){
                    dir = 0;
                }
            }
        }
        return count;
    }
}