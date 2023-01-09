import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int result = 0;
        
        for(int i = 0 ; i < input.length() ; i++){
            char target = input.charAt(i);
            if(target >= 83){
                target -= 1;
            }
            if(target == 89){
                target -= 1;
            }
                
            result += ((target - 65) / 3 + 3);
        }
        System.out.println(result);
    }
}