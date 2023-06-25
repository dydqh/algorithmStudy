import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;

        for(int i = 0 ; i < 8 ; i++){
            String input = br.readLine();

            for(int j = 0 ; j < 8 ; j++){
                if((j + i) % 2 == 0 && input.charAt(j) == 'F'){
                    result++;
                }
            }
        }
        
        System.out.println(result);
    }
}