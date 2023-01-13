import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int count = Integer.parseInt(input[0]);
        int target = Integer.parseInt(input[1]);
        String[] numberStrings = br.readLine().split(" ");
        int[] numbers = new int[count];

        for(int i = 0 ; i < count ; i++){
            numbers[i] = Integer.parseInt(numberStrings[i]);
        }
        int minus = target + 1;
        int result = 0;

        for(int i = 0; i < count - 2 ; i++){
            for(int j = i + 1 ; j < count - 1 ; j++){
                for(int k = j + 1 ; k < count ; k++){
                    int sum = numbers[i] + numbers[j] + numbers[k];
                    if(sum <= target && (target - sum) < minus){
                        minus = target - sum;
                        result = sum;
                    }
                }
            }
        }

        System.out.println(result);
    }
}