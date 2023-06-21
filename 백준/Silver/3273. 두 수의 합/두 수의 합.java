import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] numbers = new int[count];
        for(int i = 0 ; i < count ; i++){
            numbers[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(numbers);
        int target = Integer.parseInt(br.readLine());
        int start = 0;
        int end = count - 1;
        int result = 0;

        while(start < end){
            if(start >= numbers.length || end < 0){
                break;
            }
            
            if(numbers[start] + numbers[end] == target){
                result++;
                start++;
                end--;
            }
            else if(numbers[start] + numbers[end] > target){
                end--;
            }
            else if(numbers[start] + numbers[end] < target){
                start++;
            }
        }
       
        System.out.println(result);
    }
}