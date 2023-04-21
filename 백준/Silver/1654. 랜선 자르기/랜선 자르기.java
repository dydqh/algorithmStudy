import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int K = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        int[] arr = new int[K];
        long max = 0;

        for(int i = 0 ; i < K ; i++){
            arr[i] = Integer.parseInt(br.readLine());
            max = arr[i] > max ? arr[i] : max;
        }
        System.out.println(getResult(arr, max, N));
    }

    public static long getResult(int[] arr, long maxValue, int N){
        long min = 0;
        long max = maxValue + 1;

        while(min < max){
            long mid = min + ((max - min) / 2);

            long count = 0;

            for (int i = 0; i < arr.length; i++) {
                count += (arr[i] / mid);
            }

            if(count < N){
                max = mid;
            }
            else{
                min = mid + 1;
            }
        }

        return max - 1;
    }
}