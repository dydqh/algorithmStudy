class Solution {
    public int solution(String[] babbling) {
        int result = 0;
        
        for(int i = 0 ; i < babbling.length ; i++){
            String target = babbling[i];
            
            int current = 0;
            while(target.length() > 0){
                if(target.indexOf("aya") == 0){
                    if(current != 1){
                        target = target.substring(3, target.length());
                        current = 1;
                    }
                    else{
                        break;
                    }
                }
                else if(target.indexOf("ye") == 0){
                    if(current != 2){
                        target = target.substring(2, target.length());
                        current = 2;
                    }
                    else{
                        break;
                    }
                }
                else if(target.indexOf("woo") == 0){
                    if(current != 3){
                        target = target.substring(3, target.length());
                        current = 3;
                    }
                    else{
                        break;
                    }
                }
                else if(target.indexOf("ma") == 0){
                    if(current != 4){
                        target = target.substring(2, target.length());
                        current = 4;
                    }
                    else{
                        break;
                    }
                }
                else{
                    break;
                }
            }
            if(target.length() == 0){
                result += 1;
            }
        }
        
        return result;
    }
}