import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int[][] max = new int[park.length][park[0].length];
        int curMax = 0;
        Arrays.sort(mats);
        for(int i = 0 ; i < park.length ; i++){
            for(int j = 0 ; j < park[i].length ; j++){
                if(park[i][j].equals("-1")){
                    check(park, max, i, j);
                    curMax = Math.max(curMax, max[i][j]);
                }
            }
        }
        for(int i = mats.length - 1 ; i >= 0 ; i--){
            if(mats[i] <= curMax){
                answer = mats[i];
                break;
            }
        }
        return answer;
    }

    public void check(String[][] park, int[][] max, int i, int j){
        int size = 1;
        boolean possible = true;
        while(possible){
            for(int curI = i ; curI < i + size ; curI++){
                for(int curJ = j ; curJ < j + size ; curJ++){
                    if(!park[curI][curJ].equals("-1")){
                        possible = false;
                        size--;
                        break;
                    }
                }
                if(!possible){
                    break;
                }
            }
            if(!possible || i + size >= park.length || j + size >= park[0].length){
                break;
            }
            size++;
        }
        max[i][j] = size;
    }
}