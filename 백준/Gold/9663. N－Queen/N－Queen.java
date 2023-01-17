import java.io.*;

class Main{
    public static int N;
    public static int[] arr;
    public static int result = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        nQueen(0);

        System.out.println(result);
    }

    public static void nQueen(int col){
        if(col == N){
            result += 1;
            return;
        }

        for(int i = 0 ; i < N ; i++){
            arr[col] = i;

            if(isPossible(col, arr)){
                nQueen(col + 1);
            }
        }
    }

    public static boolean isPossible(int col, int[] arr){
        if(col == 0){
            return true;
        }
        else{
            for(int i = 0 ; i < col ; i++){
                if(arr[i] == arr[col]){
                    return false;
                }

                if(Math.abs(arr[i] - arr[col]) == Math.abs(i - col)){
                    return false;
                }
            }
        }
        return true;
    }
    
}