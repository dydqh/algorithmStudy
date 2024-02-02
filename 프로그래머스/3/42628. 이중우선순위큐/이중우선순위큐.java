import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        List<Integer> arr = new ArrayList<>();

        for(String operation : operations){
            String[] cmd = operation.split(" ");

            if(cmd[0].equals("I")){
                arr.add(Integer.parseInt(cmd[1]));
            }
            else if(!arr.isEmpty()){
                if(cmd[1].equals("1")){
                    int max = arr.get(0);
                    for(int value : arr){
                        max = Math.max(value, max);
                    }
                    arr.remove((Integer) max);
                }
                else{
                    int min = arr.get(0);
                    for(int value : arr){
                        min = Math.min(value, min);
                    }
                    arr.remove((Integer) min);
                }
            }
        }

        if(!arr.isEmpty()){
            int max = arr.get(0);
            int min = arr.get(0);
            for(int value : arr){
                min = Math.min(value, min);
                max = Math.max(value, max);
            }
            return new int[]{max, min};
        }
        else{
            return new int[]{0, 0};
        }
    }
}