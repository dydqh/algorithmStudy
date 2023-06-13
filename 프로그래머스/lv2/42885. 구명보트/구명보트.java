import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int index = 0;
        int curSum = 0;
        int count = 0;

        for(int i = people.length - 1 ; i >= index ; i--){
            count++;
            curSum += people[i];
            while(curSum <= limit){
                curSum += people[index];
                index++;
            }
            index--;
            if(i <= index || index < 0){
                break;
            }
            curSum = 0;
        }

        return count;
    }
}