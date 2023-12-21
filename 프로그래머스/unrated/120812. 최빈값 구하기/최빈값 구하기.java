class Solution {
    public int solution(int[] array) {
        int[] count = new int[1001];
        int max = 0;
        int maxCount = 0;

        for(int i = 0 ; i < array.length ; i++){
            count[array[i]]++;
            if(maxCount < count[array[i]]){
                maxCount = count[array[i]];
                max = array[i];
            }
            else if(maxCount == count[array[i]]){
                max = -1;
            }
        }
        
        return max;
    }
}