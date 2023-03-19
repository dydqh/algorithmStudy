import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        int[] aList = new int[n];
        String[] aInput = br.readLine().split(" ");
        for(int i = 0 ; i < n ; i++){
            aList[i] = Integer.parseInt(aInput[i]);
        }
        Arrays.sort(aList);
        int m = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        for(int i = 0 ; i < m ; i++){
            sb.append(includeCheck(aList, 0, aList.length - 1, Integer.parseInt(input[i]))).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int includeCheck(int[] arr, int start, int end, int target){
        int mid = (start + end) / 2;

        if(start >= end){
            return 0;
        }

        if(target == arr[mid]){
            return 1;
        }

        if(start == mid){
            if(target == arr[mid] || target == arr[mid + 1]){
                return 1;
            }
            else{
                return 0;
            }
        }

        if(target < arr[mid]){
            return includeCheck(arr, start, mid, target);
        }
        else if(target > arr[mid]){
            return includeCheck(arr, mid, end, target);
        }
        else{
            return 1;
        }
    }
}