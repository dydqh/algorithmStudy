class Solution {
    public int solution(String[] strArr) {
        int max = 0;
        int[] count = new int[31];
        for(int i = 0 ; i < strArr.length ; i++){
            count[strArr[i].length()]++;
            max = count[strArr[i].length()] > max ? count[strArr[i].length()] : max;
        }
        return max;
    }
}