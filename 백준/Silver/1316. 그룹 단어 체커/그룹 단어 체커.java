import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int result = 0;
        
        for(int i = 0 ; i < count ; i++){
            String input = br.readLine();
            boolean[] checkTarget = new boolean[123];
            char lastChar = '0';
            boolean isTarget = true;
            
            for(int j = 0 ; j < input.length() ; j++){
                char curChar = input.charAt(j);
                if(checkTarget[curChar] && lastChar != curChar){
                    isTarget = false;
                    break;
                }
                if(lastChar != curChar){
                    checkTarget[lastChar] = true;
                }
                lastChar = curChar;
            }
            
            if(isTarget){
                result += 1;
            }
        }
        
        System.out.println(result);
    }
}