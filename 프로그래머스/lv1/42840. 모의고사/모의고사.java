class Solution {
    public int[] solution(int[] answers) {
        int st1 = 1;
        int st2 = 2;
        int st3 = 3;
        int[] score = new int[3]; 
        
        int subst2 = 1;
        for(int i = 0 ; i < answers.length ; i++){
            if(answers[i] == st1){
                score[0] += 1;
            }
            if(answers[i] == st2){
                score[1] += 1;
            }
            if(answers[i] == st3){
                score[2] += 1;
            }
            
            st1 += 1;
            if(st1 == 6){
                st1 = 1;
            }
            
            if(i % 2 == 0){
                st2 = subst2;
            }
            else{
                st2 = 2;
                subst2 += 1;
                if(subst2 == 2){
                    subst2 = 3;
                }
                if(subst2 == 6){
                    subst2 = 1;
                }
            }
            
            if(i % 2 != 0){
                if(st3 == 2){
                    st3 = 4;
                }
                else if(st3 == 3){
                    st3 = 1;
                }
                else if(st3 == 5){
                    st3 = 3;
                }
                else{
                    st3 += 1;
                }
            }
        }
        
        if(score[0] == score[1]){
            if(score[0] == score[2]){
                return new int[]{1, 2, 3};
            }
            else if(score[0] > score[2]){
                return new int[]{1, 2};
            }
            else{
                return new int[]{3};
            }
        }
        else if(score[0] > score[1]){
            if(score[0] == score[2]){
                return new int[]{1, 3};
            }
            else if(score[2] > score[0]){
                return new int[]{3};
            }
            else{
                return new int[]{1};
            }
        }
        else{
            if(score[1] == score[2]){
                return new int[]{2, 3};
            }
            else if(score[2] > score[1]){
                return new int[]{3};
            }
            else{
                return new int[]{2};
            }
        }
    }
}