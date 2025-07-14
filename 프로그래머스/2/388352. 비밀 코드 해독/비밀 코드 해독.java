class Solution {
    public int solution(int n, int[][] q, int[] ans) {
        int answer = 0 ;
        
        for(int i1 = 1 ; i1 <= n - 4 ; i1++){
            for(int i2 = i1 + 1 ; i2 <= n - 3 ; i2++){
                for(int i3 = i2 + 1 ; i3 <= n - 2 ; i3++){
                    for(int i4 = i3 + 1 ; i4 <= n - 1 ; i4++){
                        for(int i5 = i4 + 1 ; i5 <= n ; i5++){
                            if(check(new int[]{i1, i2, i3, i4, i5}, q, ans)){
                                answer++;
                            }
                        }
                    }
                }
            }
        }

        return answer;
    }

    public static boolean check(int[] iList, int[][] q, int[] ans){
        boolean isTarget = true;

        for(int i = 0 ; i < q.length ; i++){
            if(!check(iList, q[i], ans[i])){
                isTarget = false;
                break;
            }
        }

        return isTarget;
    }

    public static boolean check(int[] iList, int[] curQ, int curAns) {
        int iIndex = 0;
        int qIndex = 0;

        while(iIndex < 5 && qIndex < 5){
            if(curAns < 0) {
                break;
            }
            else if(iList[iIndex] == curQ[qIndex]) {
                curAns--;
                iIndex++;
                qIndex++;
            } else if(iList[iIndex] < curQ[qIndex]) {
                iIndex++;
            }
            else{
                qIndex++;
            }
        }

        return curAns == 0;
    }
}