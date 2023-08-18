import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        Stack<Integer> stack = new Stack<>();
        int lastNumber = 0;
        boolean isPossible = true;

        for(int i = 0 ; i < N ; i++){
            int curNumber = Integer.parseInt(input[i]);

            if(stack.size() == 0){
                stack.push(curNumber);
            }
            else{
                if(curNumber > stack.peek()){
                    while(stack.size() > 0 && stack.peek() < curNumber){
                        if(lastNumber < stack.peek()){
                            lastNumber = stack.pop();
                        }
                        else{
                            isPossible = false;
                            break;
                        }
                    }
                    
                    if(!isPossible){
                        break;
                    }
                    else{
                        stack.push(curNumber);
                    }
                }
                else{
                    stack.push(curNumber);
                }
            }
        }

        while(stack.size() > 0){
            if(lastNumber < stack.peek()){
                lastNumber = stack.pop();
            }
            else{
                isPossible = false;
                break;
            }
        }

        if(isPossible){
            System.out.println("Nice");
        }
        else{
            System.out.println("Sad");
        }
    }
}