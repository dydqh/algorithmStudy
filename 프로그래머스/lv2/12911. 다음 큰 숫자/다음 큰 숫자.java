class Solution {
    public int solution(int n) {
        int origin = oneCount(n);
        int answer = 0;
        
        while(true){
            n++;
            if(origin == oneCount(n)){
                answer = n;
                break;
            }
        }
        
        return answer;
    }
    
    public static int oneCount(int targetNumber){
        int oneCount = 0;
        
        while(targetNumber > 0){
            if(targetNumber % 2 == 1){
                oneCount++;
            }
            targetNumber /= 2;
        }
        
        return oneCount;
    }
}