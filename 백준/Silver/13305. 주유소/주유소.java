import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] input_distance = br.readLine().split(" ");
        String[] input_price = br.readLine().split(" ");
        Stack<Long> stack_price = new Stack<>();
        Stack<Long> stack_distance = new Stack<>();

        long curDistance = 0;
        long curPrice = Integer.parseInt(input_price[0]);

        for(int i = 0 ; i < count - 1 ; i++){
            int index = i;
            int index_next = i + 1;

            curDistance += Integer.parseInt(input_distance[index]);

            if(curPrice >= Integer.parseInt(input_price[index_next])){
                stack_price.add(curPrice);
                stack_distance.add(curDistance);
                curPrice = Integer.parseInt(input_price[index_next]);
                curDistance = 0;
            }
        }

        if(curDistance != 0){
            stack_price.add(curPrice);
            stack_distance.add(curDistance);
        }

        long result = 0;
        while(stack_price.size() > 0){
            result += (stack_price.pop() * stack_distance.pop());
        }

        System.out.println(result);
    }
}