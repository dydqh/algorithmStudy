import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int[] list = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for(int i = 0 ; i < numbers.length ; i++){
            list[numbers[i]] = 0;
        }
        
        int result = 0;
        for(int i = 0 ; i < list.length ; i++){
            result += list[i];
        }
        
        return result;
    }
}