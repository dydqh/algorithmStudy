class Solution {
    public String solution(String s) {
        int max = 0;
        int min = 0;
        
        String[] splited = s.split(" ");
        for(int i = 0 ; i < splited.length ; i++){
            int curNumber = Integer.parseInt(splited[i]);
            if(i == 0){
                max = curNumber;
                min = curNumber;
            }
            else{
                max = curNumber > max ? curNumber : max;
                min = curNumber < min ? curNumber : min;
            }
        }
        
        return String.valueOf(min) + " " + String.valueOf(max);
    }
}