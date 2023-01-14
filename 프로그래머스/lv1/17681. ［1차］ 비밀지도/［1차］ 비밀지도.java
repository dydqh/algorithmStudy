class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        StringBuffer sb = new StringBuffer();
        boolean[][] bool1 = new boolean[n][n];
        boolean[][] bool2 = new boolean[n][n];
        String[] answer = new String[n];
        
        for(int i = 0 ; i < n ; i++){
            int number1 = arr1[i];
            int number2 = arr2[i];
            int index = n;
            
            while(index > 0){
                bool1[i][index - 1] = number1 % 2 == 1 ? true : false;
                number1 /= 2;
                index--;
            }
            
            index = n;
            while(index > 0){
                bool2[i][index - 1] = number2 % 2 == 1 ? true : false;
                number2 /= 2;
                index--;
            }
        }
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(bool1[i][j] || bool2[i][j]){
                    sb.append("#");
                }
                else{
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
            sb.setLength(0);
        }
        
        return answer;
    }
}