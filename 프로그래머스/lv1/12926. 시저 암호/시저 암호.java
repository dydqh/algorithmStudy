class Solution {
    public String solution(String s, int n) {
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0 ; i < s.length() ; i++){
            char origin = s.charAt(i);
            
            if(origin >= 'a' && origin <= 'z'){
                origin -= 97;
                origin += n;
                origin %= 26;
                origin += 97;
                sb.append(origin);
            }
            else if(origin >= 'A' && origin <= 'Z'){
                origin -= 65;
                origin += n;
                origin %= 26;
                origin += 65;
                sb.append(origin);
            }
            else if(origin >= '0' && origin <= '9'){
                origin -= 48;
                origin += n;
                origin %= 10;
                origin += 48;
                sb.append(origin);
            }
            else if(origin == ' '){
                sb.append(origin);
            }
        }

        return sb.toString();
    }
}