class Solution {
    public int[] solution(String[] wallpaper) {
        int startX = 51;
        int endX = 0;
        int startY = -1;
        int endY = 0;
        
        for(int i = 0 ; i < wallpaper.length ; i++){
            int jIndex = wallpaper[i].length() - 1;
            int endIndex = -1;
            int startIndex = -1;
            
            for(int j = 0 ; j < jIndex ; j++){
                if(wallpaper[i].charAt(j) == '#'){
                    startIndex = j;
                    if(endIndex == -1){
                        endIndex = j;
                    }
                    break;
                }
            }
            
            for(int j = jIndex ; j >= 0 ; j--){
                if(wallpaper[i].charAt(j) == '#'){
                    endIndex = j;
                    if(startIndex == -1){
                        startIndex = j;
                    }
                    break;
                }
            }
            
            if(endIndex != -1 || startIndex != -1){
                if(startY == -1){
                    startY = i;
                }
                endY = i + 1;
                
                startX = startX > startIndex ? startIndex : startX;
                endX = endX < endIndex + 1 ? endIndex + 1 : endX;
            }
        }
        
        int[] answer = new int[]{startY, startX, endY, endX};
        return answer;
    }
}