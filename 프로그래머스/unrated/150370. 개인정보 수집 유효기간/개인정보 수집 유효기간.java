import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0 ; i < privacies.length ; i++){
            
            String date = privacies[i].split(" ")[0];
            int year = Integer.parseInt(date.split("\\.")[0]);
            int month = Integer.parseInt(date.split("\\.")[1]);
            int day = Integer.parseInt(date.split("\\.")[2]);
            String term = privacies[i].split(" ")[1];
            
            for(int j = 0 ; j < terms.length ; j++){
                String curTerm = terms[j].split(" ")[0];
                int curMonth = Integer.parseInt(terms[j].split(" ")[1]);
                if(curTerm.equals(term)){
                    month += curMonth;
                    if(month > 12){
                        int curYear = (month - 1) / 12;
                        month -= (curYear * 12);
                        year += curYear;
                    }
                    break;
                }
            }
            
            int todayYear = Integer.parseInt(today.split("\\.")[0]);
            int todayMonth = Integer.parseInt(today.split("\\.")[1]);
            int todayDay = Integer.parseInt(today.split("\\.")[2]);
            
            if(todayYear > year){
                result.add(i+1);
                continue;
            }
            else if(todayYear == year){
                if(todayMonth > month){
                    result.add(i+1);
                    continue;
                }
                else if(todayMonth == month){
                    if(todayDay >= day){
                        result.add(i+1);
                        continue;
                    }
                }
            }
        }
        int[] answer = result.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}