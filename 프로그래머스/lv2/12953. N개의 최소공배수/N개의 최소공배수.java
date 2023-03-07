class Solution {
    public int solution(int[] arr) {
        int large = arr[1] > arr[0] ? arr[1] : arr[0];
        int small = arr[1] < arr[0] ? arr[1] : arr[0];
        int gcd = gcd(large, small);
        int lcm = arr[1] * arr[0] / gcd;
        
        for(int i = 2 ; i < arr.length ; i++){
            large = arr[i] > lcm ? arr[i] : lcm;
            small = arr[i] < lcm ? arr[i] : lcm;
            gcd = gcd(large, small);
            lcm = arr[i] * lcm / gcd;
        }
        
        return lcm;
    }
    
    public static int gcd(int large, int small){
        if(large % small == 0){
            return small;
        }
        else{
            return gcd(small, large % small);
        }
    }
}