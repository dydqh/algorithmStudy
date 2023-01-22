import java.io.*;

class Main{
    public static int[] arr;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        
        System.out.println(count(N));
    }
    
    public static int count(int N){
        if(N == 3 || N == 2){
            return 1;
        }
        if(N == 1){
            return 0;
        }
        
        if(arr[N] == 0){
            if(N % 3 == 0 && N % 2 == 0){
                arr[N] = Math.min(Math.min(count(N / 3), count(N / 2)), count(N - 1)) + 1;
            }
            else if(N % 3 == 0){
                arr[N] = Math.min(count(N / 3), count(N - 1)) + 1;
            }
            else if(N % 2 == 0){
                arr[N] = Math.min(count(N / 2), count(N - 1)) + 1;
            }
            else{
                arr[N] = count(N - 1) + 1;
            }
        }
        
        return arr[N];
    }
}