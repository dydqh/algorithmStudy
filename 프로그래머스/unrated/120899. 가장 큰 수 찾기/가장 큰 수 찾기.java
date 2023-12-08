class Solution {
    public int[] solution(int[] array) {
        int max = array[0];
        int index = 0;
        for(int i = 1 ; i < array.length ; i++){
            int curMax = max;
            max = Math.max(array[i], max);
            if(curMax != max){
                index = i;
            }
        }
        return new int[]{max, index};
    }
}