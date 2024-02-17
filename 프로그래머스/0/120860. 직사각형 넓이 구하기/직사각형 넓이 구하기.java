class Solution {
    public int solution(int[][] dots) {
        int wLarge = dots[0][0];
        int wSmall = dots[0][0];
        int hLarge = dots[0][1];
        int hSmall = dots[0][1];
        for(int i = 1 ; i < 4 ; i++){
            wLarge = Math.max(wLarge, dots[i][0]);
            wSmall = Math.min(wSmall, dots[i][0]);
            hLarge = Math.max(hLarge, dots[i][1]);
            hSmall = Math.min(hSmall, dots[i][1]);
        }
        return (wLarge - wSmall) * (hLarge - hSmall);
    }
}