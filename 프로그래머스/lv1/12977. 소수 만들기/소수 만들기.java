import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        
        for(int i = 2 ; i < Math.sqrt(max + 1) ; i++){
            if(!isPrime[i]){
                continue;
            }
            
            int number = i;
            int index = 2;
            while(index * i <= max){
                isPrime[index * i] = false;
                index++;
            }
        }
        
        int result = 0;
        for(int i = 0 ; i < nums.length - 2 ; i++){
            for(int j = i + 1 ; j < nums.length - 1 ; j++){
                for(int k = j + 1 ; k < nums.length ; k++){
                    if(isPrime[nums[i] + nums[j] + nums[k]]){
                        result += 1;
                    }
                }
            }
        }
        
        return result;
    }
}