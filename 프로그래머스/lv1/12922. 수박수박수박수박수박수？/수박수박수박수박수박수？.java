class Solution {
    public String solution(int n) {
        StringBuffer sb = new StringBuffer();
        String[] watermelon = new String[] {"수", "박"};
        
        for(int i = 0 ; i < n ; i ++){
            if(i % 2 == 0){
                sb.append(watermelon[0]);
            }
            else{
                sb.append(watermelon[1]);
            }
        }
        
        return sb.toString();
    }
}