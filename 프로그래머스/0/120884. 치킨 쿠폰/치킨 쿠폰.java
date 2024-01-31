class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = 0;
        while(chicken > 0){
            coupon += chicken;
            chicken = coupon / 10;
            coupon %= 10;
            answer += chicken;
        }
        return answer;
    }
}