import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0 ; i < book_time.length ; i++){
            List<Integer> listItem = new ArrayList<>();
            int startSecond = Integer.parseInt(book_time[i][0].split(":")[0]) * 60 + Integer.parseInt(book_time[i][0].split(":")[1]);
            int endSecond = Integer.parseInt(book_time[i][1].split(":")[0]) * 60 + Integer.parseInt(book_time[i][1].split(":")[1]);
            listItem.add(startSecond);
            listItem.add(endSecond);
            list.add(listItem);
        }

        Collections.sort(list, (next, pre) -> {
            int nextStartSecond = next.get(0);
            int preStartSecond = pre.get(0);

            if(nextStartSecond < preStartSecond){
                return -1;
            }
            else if(nextStartSecond > preStartSecond){
                return 1;
            }
            else{
                return 0;
            }
        });

        List<int[]> rooms = new ArrayList<>();
        rooms.add(new int[]{list.get(0).get(0), list.get(0).get(1) + 10});

        for(int i = 1 ; i < list.size() ; i++){
            int curStart = list.get(i).get(0);
            int curEnd = list.get(i).get(1);

            boolean newRoom = true;
            for(int j = 0 ; j < rooms.size() ; j++){
                if(curStart >= rooms.get(j)[1]){
                    rooms.get(j)[1] = curEnd + 10;
                    newRoom = false;
                    break;
                }
            }
            if(newRoom){
                rooms.add(new int[]{curStart, curEnd + 10});
            }
        }

        return rooms.size();
    }
}