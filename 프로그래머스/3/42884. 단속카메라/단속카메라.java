import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes, (o1, o2) -> { return o1[0] != o2[0] ? o1[0] - o2[0] : o2[1] - o1[1];});
        int end = routes[0][1];
        for(int[] route : routes){
            if(route[0] <= end){
                end = Math.min(route[1], end);
            }
            else{
                answer++;
                end = route[1];
            }
        }
        answer++;
        return answer;
    }
}