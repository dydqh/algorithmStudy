class Solution {
    public String solution(String new_id) {
        String answer = lev1(new_id);
        answer = lev2(answer);
        answer = lev3(answer);
        answer = lev4(answer);
        answer = lev5(answer);
        answer = lev6(answer);
        answer = lev7(answer);
        return answer;
    }
    
    public static String lev1(String s){
        return s.toLowerCase();
    }
    
    public static String lev2(String s){
        for(int i = 0 ; i < s.length() ; i++){
            char target = s.charAt(i);
            if(!(target >= 'a' && target <= 'z') && !(target >= '0' && target <= '9') && target != '-' && target != '_' && target != '.'){
                if(i == 0){
                    s = s.substring(1, s.length());
                }
                else{
                    s = s.substring(0, i) + s.substring(i + 1, s.length());
                }
                i--;
            }
        }
        return s;
    }
    
    public static String lev3(String s){
        for(int i = 0 ; i < s.length() - 1 ; i++){
            if(s.charAt(i) == '.' && s.charAt(i + 1) == '.'){
                if(i == 0){
                    s = s.substring(1, s.length());
                }
                else{
                    s = s.substring(0, i) + s.substring(i + 1, s.length());
                }
                i--;
            }
        }
        return s;
    }
    
    public static String lev4(String s){
        while(s.length() > 1 && s.charAt(0) == '.'){
            s = s.substring(1, s.length());
        }
        
        while(s.length() > 1 && s.charAt(s.length() - 1) == '.'){
            s = s.substring(0, s.length() - 1);
        }
        
        if(s.length() == 1 && s.charAt(0) == '.'){
            return "";
        }
        else{
            return s;
        }
    }
    
    public static String lev5(String s){
        if(s == ""){
            return "a";
        }
        else{
            return s;
        }
    }
    
    public static String lev6(String s){
        if(s.length() > 15){
            s = s.substring(0, 15);
            
            if(s.charAt(14) == '.'){
                s = s.substring(0, 14);
            }
        }
        
        return s;
    }
    
    public static String lev7(String s){
        if(s.length() <= 2){
            while(s.length() <= 2){
                s = s + s.charAt(s.length() - 1);
            }
        }
        return s;
    }
}