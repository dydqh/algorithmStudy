import java.io.*;

class Main{
    public static int[] arr;
    public static int max = -100000001;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            int N = Integer.parseInt(numbers[i]);

            if(i == 0){
                arr[0] = N;
                max = N;
            }
            else{
                if(arr[i - 1] > 0){
                    arr[i] = arr[i - 1] + N;
                }
                else{
                    arr[i] = N;
                }
                max = arr[i] > max ? arr[i] : max;
            }
        }

        System.out.println(max);
    }
}