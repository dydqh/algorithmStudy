import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            set.add(nums[i]);
        }
        int min = set.size() > nums.length / 2 ? nums.length / 2 : set.size();
        return min;
    }
}