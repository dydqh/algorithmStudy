import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int[] listStart = new int[count];
        int[] listEnd = new int[count];

        for(int i = 0 ; i < count ; i++){
            String input = br.readLine();
            listStart[i] = Integer.parseInt(input.split(" ")[0]);
            listEnd[i] = Integer.parseInt(input.split(" ")[1]);
        }

        quickSort(listEnd, 0, listEnd.length - 1, listStart);

        int value = 0;
        int index = 0;

        for(int i = 0 ; i < listEnd.length ; i++){
            if(i == 0){
                value = listEnd[0];
                index = 0;
            }
            else{
                if(listEnd[i] != value){
                    quickSort(listStart, index, i - 1, null);
                    index = i;
                    value = listEnd[i];
                }
            }
        }

        int result = 1;
        int lastEnd = listEnd[0];

        for(int i = 1 ; i < listEnd.length ; i++){
            if(listStart[i] >= lastEnd){
                result += 1;
                lastEnd = listEnd[i];
            }
        }

        System.out.println(result);
    }

    public static void quickSort(int[] arr, int start, int end, int[] arr2){
        if (start >= end){
            return;
        }

        int pivot = start;
        int low = start + 1;
        int high = end;

        while(low <= high){
            while(low <= end && arr[low] <= arr[pivot]){
                low++;
            }
            while(high > start && arr[high] >= arr[pivot]){
                high--;
            }
            if(low > high){
                swap(arr, high, pivot, arr2);
            }
            else{
                swap(arr, low, high, arr2);
            }
        }

        quickSort(arr, start, high - 1, arr2);
        quickSort(arr, high + 1, end, arr2);
    }

    public static void swap(int[] arr, int i, int j, int[] arr2){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        if(arr2 != null){
            int temp2 = arr2[i];
            arr2[i] = arr2[j];
            arr2[j] = temp2;
        }
    }
}