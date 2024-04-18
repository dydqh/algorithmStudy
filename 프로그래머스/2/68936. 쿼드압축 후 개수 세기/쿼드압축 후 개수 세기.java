class Solution {
    public static int[] answer = new int[2];
    
    public int[] solution(int[][] arr) {
        qc(arr, 0, 0, arr.length);
        return answer;
    }

    public static void qc(int[][] arr, int r, int c, int size){
        int[] pR = new int[]{0, 0, 1, 1};
        int[] pC = new int[]{0, 1, 0, 1};

        if(size == 1){
            if(arr[r][c] == 1){
                answer[1]++;
            }
            else{
                answer[0]++;
            }
        }
        else{
            if(check(arr, r, c, size)){
                answer[arr[r][c]]++;
            }
            else{
                for(int i = 0 ; i < 4 ; i++){
                    qc(arr, r + size / 2 * pR[i], c + size / 2 * pC[i], size / 2);
                }
            }
        }
    }

    public static boolean check(int[][] arr, int r, int c, int size){
        int target = arr[r][c];
        boolean isTarget = true;
        for(int i = r ; i < r + size ; i++){
            for(int j = c ; j < c + size ; j++){
                if(arr[i][j] != target){
                    isTarget = false;
                    break;
                }
            }
            if(!isTarget){
                break;
            }
        }
        return isTarget;
    }
}