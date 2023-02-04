class Solution {
    public long solution(long n) {
        long sqrLong = (long) Math.sqrt(n);
        double sqrDouble = (double) Math.sqrt(n);
        long answer = -1;
        
        if(sqrLong == sqrDouble){
            answer = answer * -1 * (sqrLong + 1) * (sqrLong + 1);
        }
        
        return answer;
    }
}