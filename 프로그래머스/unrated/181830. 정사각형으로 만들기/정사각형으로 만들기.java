class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int[][] answer = row - col > 0 ? new int[row][row] : new int[col][col];
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < col ; j++){
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}