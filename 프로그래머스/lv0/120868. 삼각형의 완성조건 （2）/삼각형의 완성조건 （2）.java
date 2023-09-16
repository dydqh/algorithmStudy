class Solution {
    public int solution(int[] sides) {
        int small = sides[0] > sides[1] ? sides[1] : sides[0];
        int large = sides[0] + sides[1] - small;
        int max = large + small - 1;
        int min = large - small + 1;
        return max - min + 1;
    }
}