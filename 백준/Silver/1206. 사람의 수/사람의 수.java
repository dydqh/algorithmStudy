import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] numbers = new int[count];
        int result = 0;

        for(int i = 0 ; i < count ; i++){
            String[] input = br.readLine().split("[.]");
            int number = Integer.parseInt(input[0]) * 1000 + Integer.parseInt(input[1]);
            numbers[i] = number;
        }

        for(int i = 1 ; i <= 1000 ; i++){
            boolean isResult = true;

            for(int j = 0 ; j < count ; j++){
                int number = numbers[j];

                if(number > 0 && getMin(number, i) == 0){
                    isResult = false;
                    break;
                }
            }

            if(isResult){
                result = i;
                break;
            }
        }

        System.out.println(result);
    }

    public static int getMin(int target, int parent){
        int start = 0;
        int end = parent * 10 + 1;
        int mid = (start + end) / 2;
        int result = 0;

        while(start + 1 < end){
            mid = (start + end) / 2;

            int condition = (mid * 1000 / parent);
            if(condition == target){
                result = mid;
                break;
            }
            else if(condition > target){
                end = mid;
            }
            else{
                start = mid;
            }
        }

        return result;
    }
}