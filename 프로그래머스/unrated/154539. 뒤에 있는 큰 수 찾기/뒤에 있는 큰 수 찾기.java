import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        /* 1.
          
           boolean[] found = new boolean[numbers.length];
           int[] backLarge = new int[numbers.length];
          
           for(int i = 0 ; i < numbers.length ; i++){
           backLarge[i] = -1;
               for(int j = 0 ; j < i ; j++){
                   if(!found[j] && numbers[j] < numbers[i]){
                       backLarge[j] = numbers[i];
                       found[j] = true;
                   }
               }    
           }
        
        */

        /* 2.
          
           int[] backLarge = new int[numbers.length];
           Queue<Integer> notFound = new LinkedList<>();

           for(int i = 0 ; i < numbers.length ; i++){
               backLarge[i] = -1;
               notFound.add(i);

               if(notFound.size() > 0){
               int count = notFound.size();
               while(count > 0){
                   int curNumber = notFound.poll();
                   if(numbers[curNumber] < numbers[i]){
                       backLarge[curNumber] = numbers[i];
                   }
                   else{
                       notFound.add(curNumber);
                   }
                   count--;
               }
           }

        */

        int[] backLarge = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i < numbers.length ; i++){
            if(stack.size() == 0){
                stack.add(i);
            }
            else{
                if(numbers[stack.peek()] >= numbers[i]){
                    stack.push(i);
                }
                else{
                    while(stack.size() > 0 && numbers[stack.peek()] < numbers[i]){
                        backLarge[stack.pop()] = numbers[i];
                    }
                    stack.push(i);
                }
            }
        }

        while(stack.size() > 0){
            backLarge[stack.pop()] = -1;
        }
        
        return backLarge;
    }
}