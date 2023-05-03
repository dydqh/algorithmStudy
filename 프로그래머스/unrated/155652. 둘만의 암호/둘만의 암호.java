class Solution {
    public String solution(String s, String skip, int index) {
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0 ; i < s.length() ; i++){
            int target = s.charAt(i);
            
            for(int j = 0 ; j < index ; j++){
                target++;
                
                if(target > 122){
                    target -= 26;
                }
                for(int k = 0 ; k < skip.length() ; k++){
                    if((char)target == skip.charAt(k)){
                        target++;
                        k = -1;
                
                        if(target > 122){
                            target -= 26;
                        }
                    }
                }
            }
            
            sb.append((char)target);
        }
        
        return sb.toString();
    }
}