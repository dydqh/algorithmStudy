class Solution {
    public int solution(int[] common) {
        int target = common[1] - common[0] == common[2] - common[1] ? common[1] - common[0] : common[1] / common[0];
        return common[1] - common[0] == common[2] - common[1] ? common[common.length - 1] + target : common[common.length - 1] * target;
        
    }
}