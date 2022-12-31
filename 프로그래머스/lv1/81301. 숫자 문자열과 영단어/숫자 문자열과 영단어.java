class Solution {
    public static String toChange(String s, String target, String change){
        while(s.indexOf(target) != -1){
            s = s.substring(0, s.indexOf(target))
                + change 
                + s.substring(s.indexOf(target) + target.length(), s.length());
        }
        return s;
    }
    
    public int solution(String s) {
        s = toChange(s, "zero", "0");
        s = toChange(s, "one", "1");
        s = toChange(s, "two", "2");
        s = toChange(s, "three", "3");
        s = toChange(s, "four", "4");
        s = toChange(s, "five", "5");
        s = toChange(s, "six", "6");
        s = toChange(s, "seven", "7");
        s = toChange(s, "eight", "8");
        s = toChange(s, "nine", "9");
        int answer = Integer.parseInt(s);
        return answer;
    }
}