class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i = 0 ; i < babbling.length ; i++){
            if(check(babbling[i])){
                answer++;
            }
        }
        
        return answer;
    }
    
    public static boolean check(String target){
        String[] targets = new String[]{"aya", "ye", "woo", "ma"};
        boolean result = true;
        
        for(int i = 0 ; i < target.length() ; i++){
            boolean curResult = false;
            
            for(int j = 0 ; j < targets.length ; j++){
                if(target.indexOf(targets[j], i) == i){
                    i += (targets[j].length() - 1);
                    curResult = true;
                    break;
                }
            }
            
            if(!curResult){
                result = false;
                break;
            }
        }
        
        return result;
    }
}