import java.util.*;

class Solution {
    public int solution(int[][] info, int n, int m) {
        int resultA = 0;
        int resultB = 0;

        Arrays.sort(info, (a, b) -> {
            int diffA = a[0] - a[1];
            int diffB = b[0] - b[1];
            if(diffA != diffB) {
                return diffB - diffA;
            }
            else{
                return b[0] - a[0];
            }
        });

        for(int i = 0 ; i < info.length; i++){
            int curA = info[i][0];
            int curB = info[i][1];

            if(resultB + curB < m){
                resultB += curB;
            }
            else{
                resultA += curA;
            }
        }

        return resultA >= n ? -1 : resultA;
    }
}