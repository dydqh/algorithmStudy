class Solution {
    boolean solution(String s) {
        String lowerS = s.toLowerCase();
        int pCount = 0;
        int yCount = 0;
        
        for(int i = 0 ; i < s.length() ; i++){
            if(lowerS.charAt(i) == 'p'){
                pCount += 1;
            }
            else if(lowerS.charAt(i) == 'y'){
                yCount += 1;
            }
        }

        return pCount == yCount;
    }
}