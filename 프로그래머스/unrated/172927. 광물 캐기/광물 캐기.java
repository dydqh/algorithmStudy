class Solution {
    public static int min = 751;

    public int solution(int[] picks, String[] minerals) {
        int depth = 0;
        for(int i = 0 ; i < picks.length ; i++){
            depth += picks[i];
        }

        int[] arr = new int[depth];
        dfs(depth, picks, minerals, arr);
        return min;
    }

    public static void dfs(int depth, int[] picks, String[] minerals, int[] arr){
        if(depth == 0){
            int curMin = 0;
            for(int i = 0 ; i < minerals.length ; i++){
                if(i >= arr.length * 5){
                    break;
                }
                int curIndex = arr[i / 5];
                if(minerals[i].equals("diamond")){
                    if(curIndex == 2){
                        curMin += 25;
                    }
                    else if(curIndex == 1){
                        curMin += 5;
                    }
                    else{  
                        curMin += 1;
                    }
                }
                else if(minerals[i].equals("iron")){
                    if(curIndex == 2){
                        curMin += 5;
                    }
                    else{  
                        curMin += 1;
                    }
                }
                else if(minerals[i].equals("stone")){
                    curMin += 1;
                }
            }
            min = min < curMin ? min : curMin;
            return;
        }

        for(int i = 0 ; i < 3 ; i++){
            if(picks[i] > 0){
                picks[i]--;
                arr[arr.length - depth] = i;
                dfs(depth - 1, picks, minerals, arr);
                picks[i]++;
            }
        }
    }
}