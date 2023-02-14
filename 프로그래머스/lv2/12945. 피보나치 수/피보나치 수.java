class Solution {
    public static int[] result;
    
    public int solution(int n) {
        result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        
        for(int i = 2 ; i <= n ; i++){
            result[i] = ((result[i - 1] % 1234567) + (result[i - 2] % 1234567)) % 1234567;
        }
        
        return result[n];
    }
}