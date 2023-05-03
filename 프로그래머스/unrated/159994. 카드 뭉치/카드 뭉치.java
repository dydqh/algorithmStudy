class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0;
        int index2 = 0;
        String result = "Yes";
        
        for(int i = 0 ; i < goal.length ; i++){
            String curString = goal[i];
            
            if(index1 < cards1.length && curString.equals(cards1[index1])){
                index1++;
                continue;
            }
            
            if(index2 < cards2.length && curString.equals(cards2[index2])){
                index2++;
                continue;
            }
            
            result = "No";
            break;
        }
        
        return result;
    }
}