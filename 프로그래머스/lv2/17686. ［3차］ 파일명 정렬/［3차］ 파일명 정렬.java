import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        List<String[]> list = new ArrayList<>();
        for(int i = 0 ; i < files.length ; i++){
            String curFile = files[i];
            String HEAD = "";
            String NUMBER = "";
            String TAIL = "";
            int status = 0;

            for(int j = 0 ; j < curFile.length() ; j++){
                if(curFile.charAt(j) >= '0' && curFile.charAt(j) <= '9'){
                    status++;
                }
                else if(status > 0){
                    status = 6;
                }

                if(status == 0){
                    HEAD += curFile.substring(j, j + 1);
                }
                else if(status <= 5){
                    NUMBER += curFile.substring(j, j + 1);
                }
                else{
                    TAIL += curFile.substring(j, j + 1);
                }
            }

            
            list.add(new String[]{HEAD, NUMBER, TAIL});
        }

        Collections.sort(list, (next, pre) -> {
            if(next[0].toLowerCase().compareTo(pre[0].toLowerCase()) == 0){
                return Integer.parseInt(next[1]) - Integer.parseInt(pre[1]);
            }
            else{
                String tempNext = next[0].toLowerCase();
                String tempPre = pre[0].toLowerCase();
                return tempNext.compareTo(tempPre);
            }
        });

        String[] answer = new String[files.length];
        for(int i = 0 ; i < files.length ; i++){
            answer[i] = list.get(i)[0] + list.get(i)[1] + list.get(i)[2];
        }
        return answer;
    }
}