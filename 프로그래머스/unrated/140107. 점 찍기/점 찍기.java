class Solution {
    public long solution(int k, int d) {
        long result = 0;
        
        for(int i = 0 ; i <= d ; i += k){
            double max = Math.sqrt(((long)d * d) - ((long)i * i));
            result += ((long)max / k + 1);
        }
        
        return result;
    }
}