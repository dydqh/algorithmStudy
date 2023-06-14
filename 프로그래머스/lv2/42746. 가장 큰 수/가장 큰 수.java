import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        List<String> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();

        if(numbers.length == 1){
            return String.valueOf(numbers[0]);
        }
        else{
            for(int i = 0 ; i < numbers.length ; i++){
                list.add(String.valueOf(numbers[i]));
            }
    
            list.sort((next, pre) -> {
                int index = 0;
                while(pre.charAt(index) == next.charAt(index)){
                    index++;
                    if(index >= pre.length() || index >= next.length()){
                        break;
                    }
                }
    
                if(pre.equals(next)){
                    return 0;
                }
                else{
                    int a = Integer.parseInt(pre + next);
                    int b = Integer.parseInt(next + pre);
                    if(a > b){
                        return 1;
                    }
                    else if(a < b){
                        return -1;
                    }
                    else{
                        return 0;
                    }
                }
            });
    
            boolean isZero = true;
            
            for(int i = 0 ; i < list.size() ; i++){
                if(isZero && !list.get(i).equals("0")){
                    isZero = false;
                }
                if(i < list.size() - 1 && isZero){
                    continue;
                }
                sb.append(list.get(i));
            }
    
            return sb.toString();
        }
    }
}