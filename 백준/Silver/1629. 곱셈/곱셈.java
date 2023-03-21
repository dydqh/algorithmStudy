import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);

        System.out.println(partition(A, B, C));
    }

    public static long partition(int A, int B, int C){
        if(B == 1){
            return A % C;
        }

        long tempValue = partition(A, B / 2, C);

        if(B % 2 == 0){
            return tempValue * tempValue % C;
        }
        else{
            return ((tempValue * tempValue % C) * A) % C;
        }
    }
}