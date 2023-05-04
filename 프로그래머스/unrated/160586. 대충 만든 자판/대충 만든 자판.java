class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] result = new int[targets.length];
        
        for(int i = 0 ; i < targets.length ; i++){
            String target = targets[i];
            boolean isPossible = true;
            
            for(int j = 0 ; j < target.length() ; j++){
                String curTarget = String.valueOf(target.charAt(j));
                
                int min = 101;
                for(int k = 0 ; k < keymap.length ; k++){
                    int index = keymap[k].indexOf(curTarget) + 1;
                    if(index != 0){
                        min = min < index ? min : index;
                    }
                }
                if(min == 101){
                    isPossible = false;
                    break;
                }
                result[i] += min;
            }
            
            if(!isPossible){
                result[i] = -1;
            }
        }
        
        return result;
    }
}