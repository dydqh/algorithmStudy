class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0 ; i < quiz.length ; i++){
            String[] splitted = quiz[i].split(" ");
            int x = Integer.parseInt(splitted[0]);
            int y = Integer.parseInt(splitted[2]);
            int z = Integer.parseInt(splitted[4]);
            
            if(splitted[1].equals("+")){
                if(x + y == z){
                    answer[i] = "O";
                }
                else{
                    answer[i] = "X";
                }
            }
            else{
                if(x - y == z){
                    answer[i] = "O";
                }
                else{
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}