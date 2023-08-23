import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] resultASC = new int[count];
        int[] resultDESC = new int[count];
        int[] result = new int[count];
        List<Integer> arr = new ArrayList<>();

        for(int i = 0 ; i < count ; i++){
            int curNumber = Integer.parseInt(input[i]);
            if(arr.size() == 0){
                arr.add(curNumber);
                resultASC[i] = 1;
            }
            else{
                if(arr.get(arr.size() - 1) < curNumber){
                    arr.add(curNumber);
                    resultASC[i] = arr.size();
                }
                else{
                    int targetIndex = getLower(arr, curNumber);
                    arr.set(targetIndex, curNumber);
                    resultASC[i] = targetIndex + 1;
                }
            }
        }

        arr.clear();

        for(int i = count - 1 ; i >= 0 ; i--){
            int curNumber = Integer.parseInt(input[i]);
            if(arr.size() == 0){
                arr.add(curNumber);
                resultDESC[i] = 1;
            }
            else{
                if(arr.get(arr.size() - 1) < curNumber){
                    arr.add(curNumber);
                    resultDESC[i] = arr.size();
                }
                else{
                    int targetIndex = getLower(arr, curNumber);
                    arr.set(targetIndex, curNumber);
                    resultDESC[i] = targetIndex + 1;
                }
            }
        }

        int max = 0;

        for(int i = 0 ; i < count ; i++){
            result[i] = resultASC[i] + resultDESC[i];
            max = max > result[i] ? max : result[i];
        }

        System.out.println(max - 1);
    }

    public static int getLower(List<Integer> arr, int number){
        int start = 0;
        int end = arr.size();

        while(start < end){
            int mid = (end - start) / 2 + start;

            if(number <= arr.get(mid)){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }

        return start;
    }
}