import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < stages.length ; i++){
            if(!map.containsKey(stages[i])){
                map.put(stages[i], 1);
            }
            else{
                int temp = map.get(stages[i]) + 1;
                map.put(stages[i], temp);
            }
        }
        
        int userCount = stages.length;
        double[] failure = new double[N];
        for(int i = 0 ; i < N ; i++ ){
            if(!map.containsKey(i + 1)){
                failure[i] = 0;
            }
            else{
                failure[i] = (double)map.get(i+1) / userCount;
                userCount -= map.get(i+1);
            }
        }

        int[] index = new int[N];
        for(int i = 0 ; i < N ; i++){
            index[i] = i+1;
        }

        doubleQuickSort(failure, 0, N - 1, index);
        int start = 0;
        int end = 0;
        boolean isSort = false;
        for(int i = 0 ; i < failure.length - 1 ; i++){
            if(failure[i] == failure[i + 1] && i == failure.length - 2){
                end += 1;
                isSort = true;
            }
            else if(failure[i] == failure[i + 1]){
                end += 1;
            }
            else if(end > start){
                isSort = true;
            }
            else{
                start += 1;
                end += 1;
            }
            
            if(isSort){
                quickSort(index, start, end);
                isSort = false;
                end += 1;
                start = end;
            }
        }
        
        return index;
    }
    
    public static void doubleQuickSort(double[] failureArr, int start, int end, int[] indexArr){
        if(start >= end){
            return;
        }

        int pivot = end;
        int left = start;
        int right = end - 1;

        while(left <= right){
            while(right >= start && failureArr[right] <= failureArr[pivot]){
                right--;
            }
            while(left < end && failureArr[left] >= failureArr[pivot]){
                left++;
            }
            if(left >= right){
                doubleSwap(failureArr, left, pivot, indexArr);
            }
            else{
                doubleSwap(failureArr, left, right, indexArr);
            }
        }

        doubleQuickSort(failureArr, start, left - 1, indexArr);
        doubleQuickSort(failureArr, left + 1, end, indexArr);
    }

    public static void doubleSwap(double[] failureArr, int i, int j, int[] indexArr){
        double tempDouble = failureArr[i];
        failureArr[i] = failureArr[j];
        failureArr[j] = tempDouble;

        int tempInt = indexArr[i];
        indexArr[i] = indexArr[j];
        indexArr[j] = tempInt;
    }

    public static void quickSort(int[] indexArr, int start, int end){
        if(start >= end){
            return;
        }

        int pivot = start;
        int left = start + 1;
        int right = end;

        while(left <= right){
            while(left <= end && indexArr[left] <= indexArr[pivot]){
                left++;
            }
            while(right > start && indexArr[right] >= indexArr[pivot]){
                right--;
            }
            if(left >= right){
                swap(indexArr, right, pivot);
            }
            else{
                swap(indexArr, left, right);
            }
        }

        quickSort(indexArr, start, right - 1);
        quickSort(indexArr, right + 1, end);
    }

    public static void swap(int[] indexArr, int i, int j){
        int tempInt = indexArr[i];
        indexArr[i] = indexArr[j];
        indexArr[j] = tempInt;
    }
}