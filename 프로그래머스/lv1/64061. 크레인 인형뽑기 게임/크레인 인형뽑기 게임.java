import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int bl = board.length;
        List<Stack<Integer>> list = new ArrayList<>();
        Stack<Integer> basket = new Stack<>();
        int answer = 0;
        
        for(int i = 0 ; i < bl ; i++){
            Stack<Integer> tempStack = new Stack<>();
            for(int j = bl - 1 ; j >= 0 ; j--){
                if(board[j][i] == 0){
                    break;
                }
                tempStack.add(board[j][i]);
            }
            list.add(tempStack);
        }
        
        for(int i = 0 ; i < moves.length ; i++){
            Stack<Integer> tempStack = list.get(moves[i] - 1);
            int target = 0;
            if(tempStack.size() > 0){
                target = tempStack.pop(); 
            }
            
            if(basket.size() > 0 && basket.peek() == target){
                basket.pop();
                answer += 2;
            }
            else if(target != 0){
                basket.add(target);
            }
        }
        
        return answer;
    }
}