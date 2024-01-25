class Solution {
    public int solution(String my_string) {
        String[] splitted = my_string.split(" ");
        int answer = Integer.parseInt(splitted[0]);
        for(int i = 0 ; i < splitted.length - 2 ; i += 2){
            if(splitted[i + 1].equals("+")){
                answer += Integer.parseInt(splitted[i + 2]);
            }
            else{
                answer -= Integer.parseInt(splitted[i + 2]);
            }
        }
        return answer;
    }
}