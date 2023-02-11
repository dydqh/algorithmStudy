class Solution {
    public static int count = 0;
    public static int zeroCount = 0;
    
    public int[] solution(String s) {
        String cal = cal(s);
        
        while(!cal.equals("1")){
            cal = cal(cal);
        }
        
        return new int[]{count, zeroCount};
    }
    
    public static String cal(String s){
        count += 1;
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0 ; i < s.length() ; i++){
            char target = s.charAt(i);
            if(target == '1'){
                sb.append(target);
            }
            else{
                zeroCount += 1;
            }
        }
        
        int length = sb.toString().length();
        sb.setLength(0);
        
        while(length > 0){
            sb.append(length % 2);
            length /= 2;
        }
        
        return sb.reverse().toString();
    }
}