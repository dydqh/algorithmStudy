class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        int a = 0;
        int b = 0;
        
        for(int i = 2 ; i <= Math.sqrt(total) ; i++){
            if(total % i != 0){
                continue;
            }
            else{
                a = i;
                b = total / i;
                
                if((a - 2) * (b - 2) == yellow){
                    break;
                }
            }
        }
        
        return a > b ? new int[]{a, b} : new int[]{b, a};
    }
}