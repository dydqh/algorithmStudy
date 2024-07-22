import java.util.*;

class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        Arrays.sort(stations);
        int start = 1;
        for(int i = 0 ; i < stations.length ; i++){
            answer += (stations[i] - w - start + w * 2) / (w * 2 + 1);
            start = stations[i] + w + 1;
        }
        answer += (n - start + 1 + w * 2) / (w * 2 + 1);
        return answer;
    }
}