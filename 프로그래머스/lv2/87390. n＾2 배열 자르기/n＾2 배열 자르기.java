import java.util.*;

class Solution {
    public List<Long> solution(int n, long left, long right) {
        List<Long> list = new ArrayList<>();
        
        /*int index = 0;
        
        for(int i = 1 ; i <= n ; i++){
            int minus = i - 1;
            for(int j = i ; j <= n ; j++){
                if(index >= left && index <= right){
                    list.add(j);
                }
                else if(index > right){
                    break;
                }

                index++;

                if(minus > 0){
                    j--;
                    minus--;
                }
            }
        }*/
        
        for(long i = left; i <= right ; i++){
            long row = i / n;
            long col = i % n;
            
            if(row >= col){
                list.add(row + 1);
            }
            else{
                list.add(col + 1);
            }
        }
        
        return list;
    }
}