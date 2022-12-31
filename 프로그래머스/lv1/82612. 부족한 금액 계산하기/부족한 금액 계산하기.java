class Solution {
    public long solution(int price, int money, int count) {
        long result = 0;
        
        for(int i = 0 ; i < count ; i++){
            result += price * (i+1);
        }
        
        return money >= result ? 0 : result - money;
    }
}