import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long result = 0;
        for(int i = 0 ; i < input[0].length() ; i++){
            for(int j = 0 ; j < input[1].length() ; j++){
                result += ((input[0].charAt(i) - 48) * (input[1].charAt(j) - 48));
            }
        }
        System.out.println(result);
    }
}