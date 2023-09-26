import java.util.stream.IntStream;

class Solution {
    public String solution(int[] numLog) {
        StringBuffer sb = new StringBuffer();
        IntStream.range(1, numLog.length).forEach(idx -> { 
            int cur = numLog[idx] - numLog[idx - 1];
            switch (cur){
                case 1: sb.append("w"); break;
                case -1: sb.append("s"); break;
                case 10: sb.append("d"); break;
                case -10: sb.append("a"); break;
                default: break;
            }
         });
        return sb.toString();
    }
}