class Solution {
    public int solution(int n) {
        return (n - (n % 2) + 2) * (n - (n % 2)) / 4;
    }
}