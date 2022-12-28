class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int large = 0;
        int small = 0;
        
        for(int i = 0 ; i < sizes.length ; i++){
            int curLarge = sizes[i][0] > sizes[i][1] ? sizes[i][0] : sizes[i][1];
            int curSmall = sizes[i][0] > sizes[i][1] ? sizes[i][1] : sizes[i][0];
            
            large = large > curLarge ? large : curLarge;
            small = small > curSmall ? small : curSmall;
        }
        
        answer = large * small;
        return answer;
    }
}