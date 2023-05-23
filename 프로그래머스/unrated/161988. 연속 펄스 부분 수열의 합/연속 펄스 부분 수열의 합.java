class Solution {
    public long solution(int[] sequence) {
        if(sequence.length == 1){
            return Math.abs(sequence[0]);
        }
        else{
            long[] sum = new long[sequence.length];

            sum[0] = sequence[0] * 1;
    
            for(int i = 1 ; i < sequence.length ; i++){
                sum[i] = i % 2 == 0 ? sequence[i] * 1 + sum[i - 1] : sequence[i] * -1 + sum[i - 1];
            }
    
            long max = 0;
            long min = 0;

            for(int i = 0 ; i < sequence.length ; i++){
                max = max > sum[i] ? max : sum[i];
                min = min < sum[i] ? min : sum[i];
            }
    
            return Math.abs(max - min);
        }
    }
}