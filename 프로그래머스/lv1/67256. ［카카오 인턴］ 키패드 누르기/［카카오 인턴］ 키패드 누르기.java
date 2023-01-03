import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuffer sb = new StringBuffer();
        int left = 10;
        int right = 12;
        
        for(int i = 0 ; i < numbers.length ; i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                left = numbers[i];
                sb.append("L");
            }
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                right = numbers[i];
                sb.append("R");
            }
            else{
                int leftD = 0;
                int rightD = 0;
                
                numbers[i] = numbers[i] == 0 ? 11 : numbers[i];
                
                if(left == 1 || left == 4 || left == 7 || left == 10){
                    leftD = (numbers[i] - 1) / 3 > (left - 1) / 3 
                        ? (numbers[i] - 1) / 3 - (left - 1) / 3 + 1
                        : (left - 1) / 3 - (numbers[i] - 1) / 3 + 1;
                }
                else{
                    leftD = (numbers[i] - 1) / 3 > (left - 1) / 3 
                        ? (numbers[i] - 1) / 3 - (left - 1) / 3 
                        : (left - 1) / 3 - (numbers[i] - 1) / 3;
                }
                
                if(right == 3 || right == 6 || right == 9 || right == 12){
                    rightD = (numbers[i] - 1) / 3 > (right - 1) / 3 
                        ? (numbers[i] - 1) / 3 - (right - 1) / 3 + 1
                        : (right - 1) / 3 - (numbers[i] - 1) / 3 + 1;
                }
                else{
                    rightD = (numbers[i] - 1) / 3 > (right - 1) / 3 
                        ? (numbers[i] - 1) / 3 - (right - 1) / 3 
                        : (right - 1) / 3 - (numbers[i] - 1) / 3;
                }
                
                if(rightD > leftD){
                    left = numbers[i];
                    sb.append("L");
                }
                else if(leftD > rightD){
                    right = numbers[i];
                    sb.append("R");
                }
                else{
                    if(hand.equals("right")){
                        right = numbers[i];
                        sb.append("R");
                    }
                    else{
                        left = numbers[i];
                        sb.append("L");
                    }
                }
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
}