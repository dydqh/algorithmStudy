import java.io.*;

class Main{
    public static int mod = 1000;
    public static int N;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        long B = Long.parseLong(input[1]);
        int[][] arr = new int[N][N];

        for(int i = 0 ; i < N ; i++){
            String[] temp = br.readLine().split(" ");
            for(int j = 0 ; j < N ; j++){
                arr[i][j] = Integer.parseInt(temp[j]) % 1000;
            }
        }

        int[][] result = partition(arr, B);

        for(int i = 0 ; i < result.length ; i++){
            for(int j = 0 ; j < result[i].length ; j++){
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
    }

    public static int[][] partition(int[][] arr, long B){
        if(B == 1){
            return arr;
        }

        int[][] tempPart = partition(arr, B / 2);

        tempPart = doComplex(tempPart, tempPart);

        if(B % 2 == 1){
            tempPart = doComplex(tempPart, arr);
        }

        return tempPart;
    }

    public static int[][] doComplex(int[][] A, int[][] B){
        int[][] result = new int[N][N];

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                for(int k = 0 ; k < N ; k++){
                    result[i][j] += ((A[i][k] % mod) * (B[k][j] % mod) % mod);
                }
                result[i][j] %= mod;
            }
        }

        return result;
    }
}