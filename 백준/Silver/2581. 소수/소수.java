import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        boolean[] isPrime = new boolean[N + 1];

        for(int i = 2 ; i <= N ; i++){
            if(isPrime[i]){
                continue;
            }
            stack.add(i);
            int target = i;
            int index = 1;
            while(target * index <= N){
                isPrime[target * index] = true;
                index += 1;
            }
        }

        int sum = 0;
        int min = 0;
        while(stack.size() > 0 && stack.peek() >= M){
            sum += stack.peek();
            min = stack.pop();
        }

        if(sum == 0 && min == 0){
            sb.append("-1");
        }
        else{
            sb.append(sum).append("\n").append(min);
        }

        System.out.println(sb.toString());
    }
}