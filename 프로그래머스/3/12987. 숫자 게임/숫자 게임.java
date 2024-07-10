import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int result = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int aIndex = 0;
        int bIndex = 0;
        while(bIndex < B.length){
            if(A[aIndex] < B[bIndex]){
                result++;
                aIndex++;
                bIndex++;
            }
            else{
                bIndex++;
            }
        }
        return result;
    }
}