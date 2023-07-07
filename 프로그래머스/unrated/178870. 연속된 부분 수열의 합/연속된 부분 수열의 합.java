class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] sum = new int[sequence.length];
        sum[0] = sequence[0];
        for(int i = 1 ; i < sequence.length ; i++){
            sum[i] = sum[i - 1] + sequence[i];
        }
        int start = -1;
        int end = -1;
        int length = 0;

        int startIndex = -1;
        int endIndex = 0;

        while(startIndex < sequence.length && endIndex < sequence.length){
            int curResult = 0;
            if(startIndex == -1){
                curResult = sum[endIndex];
            }
            else{
                curResult = sum[endIndex] - sum[startIndex];
            }
            
            if(curResult < k){
                endIndex++;
            }
            else if(curResult > k){
                startIndex++;
            }
            else{
                if((endIndex - startIndex < length) || (start == -1 && end == -1)){
                    length = endIndex - startIndex;
                    start = startIndex;
                    end = endIndex;
                    endIndex++;
                }
                else{
                    startIndex++;
                }
            }
        }
        
        return new int[]{start + 1, end};
    }
}