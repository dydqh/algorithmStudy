import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        String input = br.readLine();
        String target = br.readLine();
        Stack<Character> targetStack = new Stack<>();
        
        for(int i = 0 ; i < input.length() ; i++){
            stack.push(input.charAt(i));
            for(int j = target.length() - 1 ; j >= 0 ; j--){
                if(stack.size() == 0 || target.charAt(j) != stack.peek()){
                    while(targetStack.size() > 0){
                        stack.push(targetStack.pop());
                    }
                    break;
                }
                else{
                    targetStack.push(stack.pop());
                    if(j == 0){
                        if(targetStack.size() > 0){
                            targetStack.clear();
                        }
                    }
                }
            }
        }
        
        if(stack.size() == 0){
            System.out.println("FRULA");
        }
        else{
            while(stack.size() > 0){
                sb.append(stack.pop());
            }
            sb.reverse();
            System.out.println(sb.toString());
        }
    }
}