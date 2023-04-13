import java.io.*;

class Main{
    public static int mod = 1000000007;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long number = Long.parseLong(br.readLine());

        if(number == 0){
            System.out.println(0);
        }
        else if(number == 1){
            System.out.println(1);
        }
        else{
            long[][] arr = new long[][]{{1, 1}, {1, 0}};
            long[][] result = partition(arr, number - 1);
    
            System.out.println(result[0][0]);
        }
    }

    public static long[][] partition(long[][] arr, long number){
        if(number == 1){
            return arr;
        }

        long[][] tempPart = partition(arr, number / 2);
        tempPart = doComplex(tempPart, tempPart);

        if(number % 2 == 1){
            tempPart = doComplex(tempPart, arr);
        }
        return tempPart;
    }

    public static long[][] doComplex(long[][] A, long[][] B){
        long[][] result = new long[2][2];

        for(int i = 0 ; i < 2 ; i++){
            for(int j = 0 ; j < 2 ; j++){
                for(int k = 0 ; k < 2 ; k++){
                    result[i][j] += ((A[i][k] % mod) * (B[k][j] % mod) % mod);
                }
                result[i][j] %= mod;
            }
        }

        return result;
    }
}