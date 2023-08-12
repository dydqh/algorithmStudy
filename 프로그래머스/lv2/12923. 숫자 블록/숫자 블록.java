class Solution {
    public int[] solution(long begin, long end) {
        int[] result = new int[(int)(end - begin + 1)];
        int index = 0;

        for(int i = (int)begin ; i <= end ; i++){
            if(i == 1){
                result[index] = 0;
            }
            else{
                int cur = 1;
                int temp = 0;

                for(int j = 2 ; j <= Math.sqrt(i) ; j++){
                    if(i % j == 0){
                        if(i / j <= 10000000){
                            cur = i / j;
                            break;
                        }
                        else{
                            temp = i / j;
                        }
                    }
                }
                if(temp > 0 && cur == 1){
                    cur = i / temp;
                }
    
                result[index] = cur;
            }
            
            index++;
        }

        return result;
    }
}