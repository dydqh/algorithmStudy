import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = new ArrayList<>();
        if(direction.equals("right")){
            list.add(numbers[numbers.length - 1]);
            for(int number : Arrays.copyOfRange(numbers, 0, numbers.length - 1)){
                list.add(number);
            }
        }
        else{
            for(int number : Arrays.copyOfRange(numbers, 1, numbers.length)){
                list.add(number);
            }
            list.add(numbers[0]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}