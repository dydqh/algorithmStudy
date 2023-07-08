import java.util.*;

class Solution {
    public String[] solution(String[][] plans) {
        Stack<int[]> stack = new Stack<>();

        List<int[]> list = new ArrayList<>();

        for(int i = 0 ; i < plans.length ; i++){
            int[] curData = new int[3];
            curData[0] = i;
            curData[1] = Integer.parseInt(plans[i][1].split(":")[0]) * 60 + Integer.parseInt(plans[i][1].split(":")[1]);
            curData[2] = Integer.parseInt(plans[i][2]);
            list.add(curData);
        }

        Collections.sort(list, (next, pre) -> { 
            return next[1] - pre[1];
        });

        String[] result = new String[plans.length];
        int index = 0;

        for(int i = 0 ; i < list.size() ; i++){
            if(i == list.size() - 1){
                result[index] = plans[list.get(i)[0]][0];
                index++;
                break;
            }
            
            int[] curData = list.get(i);
            int[] nextData = list.get(i + 1);
            int curIndex = curData[0];
            int curTime = curData[1];
            int curTake = curData[2];
            int nextTime = nextData[1];

            if(curTime + curTake <= nextTime){
                result[index] = plans[curIndex][0];
                index++;
                int remindTime = nextTime - curTime - curTake;

                while(stack.size() > 0){
                    curData = stack.pop();
                    if(curData[2] <= remindTime){
                        curIndex = curData[0];
                        result[index] = plans[curIndex][0];
                        index++;
                        remindTime -= curData[2];
                    }
                    else{
                        curData[2] -= remindTime;
                        stack.push(curData);
                        break;
                    }
                }
            }
            else{
                curData[2] = curData[2] - (nextTime - curTime);
                stack.push(curData);
            }
        }

        while(stack.size() > 0){
            result[index] = plans[stack.pop()[0]][0];
            index++;
        }

        return result;
    }
}