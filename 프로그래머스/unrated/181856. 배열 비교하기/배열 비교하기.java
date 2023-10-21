import java.util.stream.IntStream;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length == arr2.length){
            int arr1Sum = IntStream.range(0, arr1.length).map(i -> arr1[i]).sum();
            int arr2Sum = IntStream.range(0, arr2.length).map(i -> arr2[i]).sum();
            answer = arr1Sum - arr2Sum > 0 ? 1 : (arr1Sum == arr2Sum ? 0 : -1);
        }
        else{
            answer = arr1.length - arr2.length > 0 ? 1 : (arr1.length == arr2.length ? 0 : -1);
        }
        return answer;
    }
}