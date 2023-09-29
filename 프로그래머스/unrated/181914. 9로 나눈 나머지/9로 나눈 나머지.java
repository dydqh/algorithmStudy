class Solution {
    public int solution(String number) {
        int target = 0;
        for(int i = 0 ; i < number.length() ; i++){
            target += Integer.parseInt(number.substring(i, i + 1));
        }
        return target % 9;
    }
}