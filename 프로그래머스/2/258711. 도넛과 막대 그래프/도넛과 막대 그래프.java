import java.util.*;

class Solution {
    public int[] solution(int[][] edges) {
        int[] answer = new int[4];
        Map<Integer, List<Integer>> out = new HashMap<>();
        Map<Integer, List<Integer>> in = new HashMap<>();
        List<Integer> dots = new ArrayList<>();

        int max = 0;
        for (int[] edge : edges) {
            if (!out.containsKey(edge[0])) {
                out.put(edge[0], new ArrayList<>());
            }
            out.get(edge[0]).add(edge[1]);

            if(!in.containsKey(edge[1])){
                in.put(edge[1], new ArrayList<>());
            }
            in.get(edge[1]).add(edge[0]);

            max = Math.max(max, edge[0]);
            max = Math.max(max, edge[1]);
        }

        for(int i = 1 ; i <= max ; i++){
            if(!in.containsKey(i) && out.containsKey(i)){
                dots.add(i);
            }
        }
        
        int dot = 0;
        if(dots.size() == 1){
            dot = dots.get(0);
        }
        else{
            dot = dots.get(0);
            for(int curDot : dots){
                if(out.get(curDot).size() > 1){
                    dot = curDot;
                }
            }
        }
        
        List<Integer> checkList = out.get(dot);
        answer[0] = dot;

        for(int checkNumber : checkList){
            in.get(checkNumber).remove(Integer.valueOf(dot));
            boolean isDonut = checkDonut(checkNumber, out, in);
            in.get(checkNumber).add(dot);
            if(isDonut){
                answer[1]++;
                continue;
            }
            in.get(checkNumber).remove(Integer.valueOf(dot));
            boolean isBar = checkBar(checkNumber, out, in);
            in.get(checkNumber).add(dot);
            if(isBar){
                answer[2]++;
                continue;
            }
            answer[3]++;
        }

        return answer;
    }

    public boolean checkDonut(int node, Map<Integer, List<Integer>> out, Map<Integer, List<Integer>> in){
        boolean result = false;
        int start = node;
        int next = node;
        
        while(true){
            if(!out.containsKey(next) || !in.containsKey(next) || out.get(next).size() != 1 || in.get(next).size() != 1){
                break;
            }
            next = out.get(next).get(0);
            if(start == next){
                result = true;
                break;
            }
        }
        
        return result;
    }

    public boolean checkBar(int node, Map<Integer, List<Integer>> out, Map<Integer, List<Integer>> in){
        boolean result = true;
        int next = node;
        int pre = node;
        
        if(out.containsKey(node) && out.get(node).size() > 0){
            if(out.get(node).size() == 1){
                next = out.get(node).get(0);
            }
            else{
                result = false;
            }
        }
        
        if(in.containsKey(node) && in.get(node).size() > 0){
            if(in.get(node).size() == 1){
                pre = in.get(node).get(0);    
            }
            else{
                result = false;
            }
        }
        
        if(result){
            if(node != next){
                while(out.containsKey(next)){
                    if(out.get(next).size() == 1){
                        next = out.get(next).get(0);
                        
                        if(next == node){
                            result = false;
                            break;
                        }
                    }
                    else{
                        result = false;
                        break;
                    }
                }
            }
            
            if(node != pre){
                while(in.containsKey(pre)){
                    if(in.get(pre).size() == 1){
                        pre = in.get(pre).get(0);
                        
                        if(pre == node){
                            result = false;
                            break;
                        }
                    }
                    else{
                        result = false;
                        break;
                    }
                }
            }
        }
        
        return result;
    }
}