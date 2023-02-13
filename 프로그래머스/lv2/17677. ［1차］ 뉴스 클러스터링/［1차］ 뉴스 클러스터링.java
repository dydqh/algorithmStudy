import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for(int i = 0 ; i < str1.length() - 1 ; i++){
            String curString = str1.substring(i, i + 2);
            char first = curString.charAt(0);
            char second = curString.charAt(1);
            if(((first >= 'a' && first <= 'z') || (first >= 'A' && first <= 'Z')) && 
            ((second >= 'a' && second <= 'z') || (second >= 'A' && second <= 'Z'))){
                list1.add(curString.toLowerCase());
            }
        }

        for(int i = 0 ; i < str2.length() - 1 ; i++){
            String curString = str2.substring(i, i + 2);
            char first = curString.charAt(0);
            char second = curString.charAt(1);
            if(((first >= 'a' && first <= 'z') || (first >= 'A' && first <= 'Z')) && 
            ((second >= 'a' && second <= 'z') || (second >= 'A' && second <= 'Z'))){
                list2.add(curString.toLowerCase());
            }
        }

        List<String> shortLengthList = list1.size() > list2.size() ? list2 : list1;
        List<String> longLengthList = list1.size() > list2.size() ? list1 : list2;

        int inter = 0;
        int union = shortLengthList.size() + longLengthList.size();

        for(int i = 0 ; i < shortLengthList.size() ; i++){
            if(longLengthList.indexOf(shortLengthList.get(i)) > -1){
                longLengthList.remove(longLengthList.indexOf(shortLengthList.get(i)));
                inter += 1;
                union -= 1;
            }
        }
        
        if(union == 0){
            return 65536;
        }
        else{
            return 65536 * inter / union;
        }
    }
}