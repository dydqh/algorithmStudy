import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        boolean[] isPrime = new boolean[1000001];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        
        for(int i = 2 ; i < Math.sqrt(1000001) ; i++){
            if(!isPrime[i]){
                continue;
            }
            
            int start = i;
            int index = 2;
            while(start * index < 1000001){
                isPrime[start * index] = false;
                index++;
            }
        }
        
        int[] nList = new int[10000001];
        int[] mList = new int[10000001];
        
        int index = 2;
        while(n > 1){
            if(n % index == 0){
                nList[index] += 1;
                n /= index;
                index = 2;
            }
            else{
                index++;
            }
        }
        index = 2;
        while(m > 1){
            if(m % index == 0){
                mList[index] += 1;
                m /= index;
                index = 2;
            }
            else{
                index++;
            }
        }
        
        int max = 1;
        int min = 1;
        for(int i = 2 ; i < 1000001; i++){
            if(mList[i] == 0 && nList[i] == 0){
                continue;
            }
            else if(mList[i] == nList[i]){
                for(int j = 0 ; j < mList[i] ; j++){
                    max *= i;
                    min *= i;
                }
            }
            else{
                if(mList[i] > nList[i]){
                    for(int j = 0 ; j < (mList[i] - nList[i]) ; j++){
                        min *= i;
                    }
                    for(int j = 0 ; j < nList[i] ; j++){
                        min *= i;
                        max *= i;
                    }
                }
                else{
                    for(int j = 0 ; j < (nList[i] - mList[i]) ; j++){
                        min *= i;
                    }
                    for(int j = 0 ; j < mList[i] ; j++){
                        min *= i;
                        max *= i;
                    }
                }
            }
        }
        
        int[] answer = new int[]{max, min};
        return answer;
    }
}