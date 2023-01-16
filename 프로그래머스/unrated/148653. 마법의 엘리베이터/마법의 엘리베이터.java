class Solution {
    public int solution(int storey) {
        int result = 0;
        
        while(storey > 0){
            int target = storey % 10;
            if(target >= 6){
                result += (10 - target);
                storey = storey / 10 + 1;
            }
            else if(target <= 4){
                result += target;
                storey = storey / 10;
            }
            else{
                if(storey / 10 % 10 >= 5){
                    result += (10 - target);
                    storey = storey / 10 + 1;
                }
                else{
                    result += target;
                    storey = storey / 10;
                }
            }
        }
        
        return result;
    }
}