class Solution {
    public int solution(String[][] board, int h, int w) {
        int[] dh = new int[]{0, 1, -1, 0};
        int[] dw = new int[]{1, 0, 0, -1};
        int answer = 0;
        
        for(int i = 0 ; i < 4 ; i++){
            int curh = h + dh[i];
            int curw = w + dw[i];
            int lenb = board.length;
            if(curh >= 0 && curw >= 0 && curh < lenb && curw < lenb){
                if(board[h][w].equals(board[curh][curw])){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}