import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int S1 = Integer.parseInt(input[0]);
        int S2 = Integer.parseInt(input[1]);
        int S3 = Integer.parseInt(input[2]);
        int[] count = new int[S1 + S2 + S3 + 1];
        int max = 0;
        int result = 0;

        for(int i = 1 ; i <= S1 ; i++){
            for(int j = 1 ; j <= S2 ; j++){
                for(int k = 1 ; k <= S3 ; k++){
                    count[i + j + k]++;
                }
            }
        }

        for(int i = S1 + S2 + S3 ; i > 0 ; i--){
            if(max <= count[i]){
                max = count[i];
                result = i;
            }
        }

        System.out.println(result);
    }
}