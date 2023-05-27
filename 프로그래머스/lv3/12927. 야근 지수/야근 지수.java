class Solution {
    public static long[] answerList;

    public long solution(int n, int[] works) {
        answerList = new long[works.length];
        int max = 0;

        for(int i = 0 ; i < works.length ; i++){
            answerList[i] = works[i];
            max = max > works[i] ? max : works[i];
        }

        return work(0, max, works, n);
    }

    public static long work(int lo, int hi, int[] works, int n){
        int mid = 0;
        int result = 0;

        while(lo + 1 < hi){
            mid = (lo + hi) / 2;
            result = 0;
            for(int i = 0 ; i < works.length ; i++){
                if(works[i] - mid > 0){
                    result += works[i] - mid;
                }
            }

            if(result == n){
                break;
            }
            else if(result > n){
                lo = mid;
            }
            else if(result < n){
                hi = mid;
            }
        }
        
        long answer = 0;
        
        
        for(int i = 0 ; i < answerList.length ; i++){
            if(answerList[i] > mid){
                n -= (answerList[i] - mid);
                answerList[i] = mid;
            }
        }

        for(int i = answerList.length - 1 ; i >= 0 ; i--){
            if(answerList[i] == mid){
                if(n < 0){
                    answerList[i]++;
                    n++;
                }
                else if(n > 0 && answerList[i] != 0){
                    answerList[i]--;
                    n--;
                }
            }

            answer += (answerList[i] * answerList[i]);
        }
        
        return answer;
    }
}