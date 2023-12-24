class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int top = numer1 * denom2 + numer2 * denom1;
        int bottom = denom1 * denom2;
        int large = top > bottom ? top : bottom;
        int small = top + bottom - large;
        int gcd = getGcd(large, small);
        return new int[]{top / gcd, bottom / gcd};
    }
    
    public static int getGcd(int large, int small){
        if(large % small == 0){
            return small;
        }
        else{
            return getGcd(small, large % small);
        }
    }
}