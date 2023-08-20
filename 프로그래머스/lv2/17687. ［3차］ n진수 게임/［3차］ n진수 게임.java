import java.util.*;

class Solution {
    public static int index = 1;
    public static Stack<Integer> stack = new Stack<>();

    public String solution(int n, int t, int m, int p) {
        StringBuffer sb = new StringBuffer();
        String[] list = new String[1000001];
        list[0] = "0";
        int curNumber = 0;

        while(index < t * m){
            cal(list, curNumber, n);
            curNumber++;
        }

        for(int i = 0 ; i < t ; i++){
            sb.append(list[i * m + p - 1]);
        }

        return sb.toString();
    }

    public static void cal(String[] list, int curNumber, int n){
        while(curNumber > 0){
            stack.push(curNumber % n);
            curNumber /= n;
        }

        while(stack.size() > 0){
            int target = stack.pop();
            if(target < 10){
                list[index] = String.valueOf(target);
            }
            else{
                list[index] = String.valueOf((char)(target + 55));
            }
            index++;
        }
    }
}