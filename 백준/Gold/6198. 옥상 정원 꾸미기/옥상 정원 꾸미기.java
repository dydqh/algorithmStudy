import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        long result = 0;
        
        for(int i = 0 ; i < count ; i++){
            int building = Integer.parseInt(br.readLine());
            if(stack.size() == 0){
                stack.add(building);
                continue;
            }
            else{
                while(stack.peek() <= building){
                    stack.pop();
                    
                    if(stack.size() == 0){
                        break;
                    }
                }
                stack.add(building);
                result += stack.size() - 1;
            }
        }
        System.out.println(result);
    }
}