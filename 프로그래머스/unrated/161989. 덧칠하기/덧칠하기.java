class Solution {
    public int solution(int n, int m, int[] section) {
        int start = section[0];
        int end = start + m;
        int count = 1;
        for(int i = 0 ; i < section.length ; i++){
            if(section[i] >= start && section[i] < end){
                continue;
            }
            else{
                start = section[i];
                end = start + m;
                count++;
            }
        }
        return count;
    }
}