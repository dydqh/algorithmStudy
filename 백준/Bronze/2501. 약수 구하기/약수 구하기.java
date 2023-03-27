import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int number = Integer.parseInt(input[0]);
        int count = Integer.parseInt(input[1]);
        
        for(int i = 1 ; i <= number ; i++){
            if(number % i == 0){
                count--;
            }
            if(count == 0){
                System.out.println(i);
                break;
            }
        }
        
        if(count > 0){
            System.out.println(0);
        }
    }
}