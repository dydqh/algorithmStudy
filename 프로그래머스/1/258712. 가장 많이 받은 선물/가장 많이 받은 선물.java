import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Integer> index = new HashMap<>();
        int[][] trade = new int[friends.length][friends.length];
        int[] point = new int[friends.length];
        int max = 0;

        for(int i = 0 ; i < friends.length ; i++){
            index.put(friends[i], i);
        }

        for(int i = 0 ; i < gifts.length ; i++){
            String[] input = gifts[i].split(" ");
            int fromIndex = index.get(input[0]);
            int toIndex = index.get(input[1]);
            point[fromIndex]++;
            point[toIndex]--;
            trade[fromIndex][toIndex]++;
        }

        for(int i = 0 ; i < friends.length ; i++){
            int result = 0;

            for(int j = 0 ; j < friends.length ; j++){
                if(i != j){
                    int get = 0;
                    int give = 0;
                    if(trade[i][j] == trade[j][i]){
                        if(point[i] > point[j]){
                            result++;
                        }
                    }
                    else if(trade[i][j] > trade[j][i]){
                        result++;
                    }
                }
            }

            max = Math.max(max, result);
        }

        return max;
    }
}