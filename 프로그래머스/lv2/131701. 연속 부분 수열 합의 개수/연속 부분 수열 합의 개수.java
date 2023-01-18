import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int[] elementsDouble = new int[elements.length * 2];
        for(int i = 0 ; i < elementsDouble.length ; i++){
            elementsDouble[i] = elements[i % elements.length];
        }

        Set<Integer> result = new HashSet<>();
        //Queue<Integer> queue = new LinkedList<>();
        int all = 0;
        

        for(int i = 1 ; i < elements.length ; i++){
            for(int j = 0 ; j < elements.length ; j++){
                if(i == 1){
                    //queue.add(elements[j]);
                    result.add(elements[j]);
                    all += elements[j];
                }
                else{
                    int curResult = 0;
                    // for(int k = 0 ; k < i ; k++){
                    //     curResult += queue.peek();
                    //     queue.add(queue.poll());
                    // }
                    // for(int k = i ; k < elements.length ; k++){
                    //     queue.add(queue.poll());
                    // }
                    // queue.add(queue.poll());
                    for(int k = j ; k < j + i ; k++){
                        curResult += elementsDouble[k];
                    }
                    result.add(curResult);
                }
            }
        }

        result.add(all);
        
        return result.size();
    }
}