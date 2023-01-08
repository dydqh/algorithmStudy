import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0 ; i < commands.length ; i++){
            int splitedArrayLength = commands[i][1] - commands[i][0] + 1;
            int[] splitedArray = new int[splitedArrayLength];
            for(int j = 0 ; j < splitedArrayLength ; j++){
                splitedArray[j] = array[j + commands[i][0] - 1];
            }
            Arrays.sort(splitedArray);
            answer[i] = splitedArray[commands[i][2] - 1];
        }
        return answer;
    }
}