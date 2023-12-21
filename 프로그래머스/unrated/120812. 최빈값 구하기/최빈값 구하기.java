import java.util.stream.IntStream;

class Solution {
    public int max = 0;
    public int maxCount = 0;
    public int[] count = new int[1001];

    public int solution(int[] array) {

        IntStream.range(0, array.length).forEach(i -> {
            count[array[i]]++;
            if(maxCount < count[array[i]]){
                maxCount = count[array[i]];
                max = array[i];
            }
            else if(maxCount == count[array[i]]){
                max = -1;
            }
        });
        
        return max;
    }
}