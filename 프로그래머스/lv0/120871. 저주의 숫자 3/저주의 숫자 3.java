class Solution {
    public int solution(int n) {
        int[] result = new int[101];
        int number = 1;
        int index = 1;
        
        while(index <= 100){
            if(number % 3 == 0){
                number++;
            }
            else if(number % 10 == 3){
                number++;
            }
            else if(number / 10 % 10 == 3){
                number++;
            }
            else{
                result[index] = number;
                index++;
                number++;
            }
        }
        
        return result[n];
    }
}