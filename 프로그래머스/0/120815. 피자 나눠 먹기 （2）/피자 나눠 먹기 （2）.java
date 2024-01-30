class Solution {
    public int solution(int n) {
        int large = n > 6 ? n : 6;
        int small = n + 6 - large;
        return large * small / gcd(large, small) / 6;
    }
    
    public static int gcd(int large, int small){
        return large % small == 0 ? small : gcd(small, large % small);
    }
}