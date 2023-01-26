import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int count = Integer.parseInt(input[1]);
        int[] numbersList = new int[n];
        String[] numbers = br.readLine().split(" ");
        for(int i = 0 ; i < n ; i++){
            numbersList[i] = Integer.parseInt(numbers[i]);
        }
        int start = 0;
        int end = start + count;
        long max = -100 * count - 1;

        if(end == n){
            long curSum = 0;
            for(int i = start ; i < end ; i++){
                curSum += numbersList[i];
            }
            max = curSum > max ? curSum : max;
        }
        else{
            while(start + count <= n){
                long curSum = 0;
                for(int i = start ; i < end ; i++){
                    curSum += numbersList[i];
                }
                max = curSum > max ? curSum : max;
                start++;
                end++;
            }
        }
        System.out.println(max);
    }
}