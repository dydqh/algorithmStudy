class Solution {
    public int solution(String dartResult) {
        int[] score = new int[3];
        int curIndex = -1;
        
        for(int i = 0 ; i < dartResult.length(); i++){
            if(dartResult.charAt(i) == '1' && dartResult.charAt(i + 1) == '0'){
                curIndex++;
                i++;
                score[curIndex] = 10;
            }
            else if(dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9'){
                curIndex++;
                score[curIndex] = dartResult.charAt(i) - 48;
            }
            else if(dartResult.charAt(i) == 'D'){
                score[curIndex] = score[curIndex] * score[curIndex];
            }
            else if(dartResult.charAt(i) == 'T'){
                score[curIndex] = score[curIndex] * score[curIndex] * score[curIndex];
            }
            else if(dartResult.charAt(i) == '*'){
                score[curIndex] = 2 * score[curIndex];
                if(curIndex > 0){
                    score[curIndex - 1] = 2 * score[curIndex - 1];
                }
            }
            else if(dartResult.charAt(i) == '#'){
                score[curIndex] = -1 * score[curIndex];
            }
        }
        
        int answer = 0;
        for(int i = 0 ; i < 3 ; i++){
            answer += score[i];
        }
        
        return answer;
    }
}