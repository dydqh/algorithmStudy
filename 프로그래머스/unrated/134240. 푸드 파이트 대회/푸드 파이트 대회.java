class Solution {
    public String solution(int[] food) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        
        for(int i = 1 ; i < food.length; i++){
            int count = food[i] / 2;
            for(int j = 0 ; j < count ; j++){
                sb.append(i);
                sb2.append(i);
            }
        }
        
        sb.append(0).append(sb2.reverse());
        
        return sb.toString();
    }
}