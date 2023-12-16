class Solution {
    public int solution(int[] sides) {
        int max = sides[1] > sides[0] ? sides[1] : sides[0];
        max = sides[2] > max ? sides[2] : max;
        int sum = sides[0] + sides[1] + sides[2];
        return sum - max - max > 0 ? 1 : 2;
    }
}