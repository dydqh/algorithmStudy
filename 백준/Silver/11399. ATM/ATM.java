import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int[] timeList = new int[count];

        for(int i = 0 ; i < count ; i++){
            timeList[i] = Integer.parseInt(input.split(" ")[i]);
        }

        quickSort(timeList, 0, timeList.length - 1);

        int result = 0;

        for(int i = 0 ; i < count ; i++){
            result += timeList[i] * (count - i);
        }

        System.out.println(result);
    }

    public static void quickSort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }

        int pivot = start;
        int left = start + 1;
        int right = end;

        while(left <= right){
            while(left <= end && arr[left] <= arr[pivot]){
                left++;
            }
            while(right > start && arr[right] >= arr[pivot]){
                right--;
            }
            if(left > right){
                swap(arr, right, pivot);
            }
            else{
                swap(arr, left, right);
            }
        }

        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}