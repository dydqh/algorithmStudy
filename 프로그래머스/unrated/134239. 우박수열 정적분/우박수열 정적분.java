import java.util.*;

class Solution {
    public double[] solution(int k, int[][] ranges) {
        long kLong = (long)k;
        double[] answer = new double[ranges.length];
        List<Long> numbers = new ArrayList<>();
        List<Double> sum = new ArrayList<>();
        numbers.add(kLong);
        
        while(kLong > 1){
            if(kLong % 2 == 0){
                kLong /= 2;
            }
            else{
                kLong = kLong * 3 + 1;
            }
            numbers.add(kLong);
            sum.add((double)(numbers.get(numbers.size() -1) + numbers.get(numbers.size() -2)) / 2.0);
            if(sum.size() > 1){
                sum.set(sum.size() - 1, sum.get(sum.size() - 1) + sum.get(sum.size() - 2));
            }
        }

        for(int i = 0 ; i < ranges.length ; i++){
            int from = ranges[i][0] - 1;
            int to = sum.size() + ranges[i][1] - 1;
            
            if(from == to){
                answer[i] = 0;
            }
            else if(from > to){
                answer[i] = -1;
            }
            else if(from >= sum.size()){
                answer[i] = -1;
            }
            else if(to < 0){
                answer[i] = -1;
            }
            else{
                if(from < 0){
                    answer[i] = sum.get(to);
                }
                else{
                    answer[i] = sum.get(to) - sum.get(from);
                }
            }
        }
        return answer;
    }
}