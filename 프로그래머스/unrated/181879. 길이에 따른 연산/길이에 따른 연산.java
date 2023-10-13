class Solution {
    public int solution(int[] arr) {
        int sum = 0;
        int product = 1;

        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            product *= arr[i];
        }
        
        return arr.length >= 11 ? sum : product;
    }
}