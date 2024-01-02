class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] list = my_string.toCharArray();
        char temp = list[num1];
        list[num1] = list[num2];
        list[num2] = temp;
        return String.valueOf(list);
    }
}