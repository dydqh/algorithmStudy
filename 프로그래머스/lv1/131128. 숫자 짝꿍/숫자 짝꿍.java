class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10];
        int[] countY = new int[10];
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0 ; i < X.length() ; i++){
            countX[X.charAt(i) - 48] += 1;
        }
        
        for(int i = 0 ; i < Y.length() ; i++){
            countY[Y.charAt(i) - 48] += 1;
        }
        
        for(int i = 9 ; i >= 0 ; i--){
            int count = countX[i] <= countY[i] ? countX[i] : countY[i];
            while(count > 0){
                sb.append(i);
                count -= 1;
            }
        }
        
        if(sb.toString().equals("")){
            return "-1";
        }
        else if(sb.toString().charAt(0) == 48){
            return "0";
        }
        else{
            return sb.toString();
        }
    }
}