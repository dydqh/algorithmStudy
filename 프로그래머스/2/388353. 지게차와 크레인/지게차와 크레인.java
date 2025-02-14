import java.util.*;

class Solution {
    public int solution(String[] storage, String[] requests) {
        int answer = 0;
        char[][] storageTable = new char[storage.length][storage[0].length()];
        for(int i = 0 ; i < storage.length ; i++){
            for(int j = 0 ; j < storage[0].length() ; j++){
                storageTable[i][j] = storage[i].charAt(j);
            }
        }
        for(int i = 0 ; i < requests.length ; i++){
            if(requests[i].length() == 1){
                singlePick(storageTable, requests[i]);
            }
            else{
                doublePick(storageTable, requests[i]);
            }
        }
        for(int i = 0 ; i < storage.length ; i++){
            for(int j = 0 ; j < storage[0].length() ; j++){
                if(storageTable[i][j] != 'x'){
                    answer++;
                }
            }
        }
        return answer;
    }
    
    public void singlePick(char[][] storageTable, String request){
        char requestChar = request.charAt(0);
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] checked = new boolean[storageTable.length][storageTable[0].length];
        
        for(int i = 0 ; i < storageTable[0].length ; i++){
            queue.add(new int[]{0, i});
            queue.add(new int[]{storageTable.length - 1, i});
        }
        
        for(int i = 1 ; i < storageTable.length - 1 ; i++){
            queue.add(new int[]{i, 0});
            queue.add(new int[]{i, storageTable[0].length - 1});
        }
        
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            char curChar = storageTable[cur[0]][cur[1]];
            if(!checked[cur[0]][cur[1]]){
                checked[cur[0]][cur[1]] = true;
                if(curChar == 'x'){
                    if(cur[0] - 1 >= 0){
                        queue.add(new int[]{cur[0] - 1, cur[1]});
                    }
                    if(cur[1] - 1 >= 0){
                        queue.add(new int[]{cur[0], cur[1] - 1});
                    }
                    if(cur[0] + 1 < storageTable.length){
                        queue.add(new int[]{cur[0] + 1, cur[1]});
                    }
                    if(cur[1] + 1 < storageTable[0].length){
                        queue.add(new int[]{cur[0], cur[1] + 1});
                    }
                }
                else if(curChar == requestChar){
                    storageTable[cur[0]][cur[1]] = 'x';
                }
            }
        }
    }
        
    public void doublePick(char[][] storageTable, String request){
        char requestChar = request.charAt(0);
        for(int i = 0 ; i < storageTable.length ; i++){
            for(int j = 0 ; j < storageTable[0].length ; j++){
                if(storageTable[i][j] == requestChar){
                    storageTable[i][j] = 'x';    
                }
            }
        }
    }
}