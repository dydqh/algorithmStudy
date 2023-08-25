import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int curScoreCount = Integer.parseInt(input[0]);
        int newScore = Integer.parseInt(input[1]);
        int maxScoreCount = Integer.parseInt(input[2]);

        if(curScoreCount == 0){
            if(maxScoreCount > 0){
                System.out.println(1);
            }
            else{
                System.out.println(-1);
            }
        }
        else{
            String[] scoreInput = br.readLine().split(" ");
            Integer[] scoreList = new Integer[scoreInput.length];

            for(int i = 0 ; i < scoreInput.length ; i++){
                scoreList[i] = Integer.parseInt(scoreInput[i]);
            }

            Arrays.sort(scoreList, Collections.reverseOrder());

            int result = search(scoreList, newScore, scoreInput.length);

            if(result >= scoreInput.length){
                if(maxScoreCount > result){
                    int target = result - 1;
                    while(target > -1 && scoreList[target] == newScore){
                        target--;
                        result--;
                    }
                    System.out.println(result + 1);
                }
                else{
                    System.out.println(-1);
                }
            }
            else{
                int target = result - 1;
                while(target > -1 && scoreList[target] == newScore){
                    target--;
                    result--;
                }
                System.out.println(result + 1);
            }
        }
    }

    public static int search(Integer[] scoreList, int newScore, int scoreInputLength){
        int start = 0;
        int end = scoreInputLength;

        while(start < end){
            int mid = (start + end) / 2;

            if(scoreList[mid] < newScore){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }

        return start;
    }
}