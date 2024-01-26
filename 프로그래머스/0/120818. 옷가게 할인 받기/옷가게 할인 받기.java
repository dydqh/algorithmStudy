class Solution {
    public int solution(int price) {
        double discountPercent = 0;
        if(price >= 500000){
            discountPercent = 20;
        }
        else if(price >= 300000){
            discountPercent = 10;
        }
        else if(price >= 100000){
            discountPercent = 5;
        }
        return (int)(price * (1 - discountPercent / 100));
    }
}