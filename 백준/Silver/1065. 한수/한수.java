import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int result = 0;
        
        for(int i = 1 ; i <= input ; i++){
            if(i / 10 == 0){
                result += 1;
            }
            else if(i / 100 == 0){
                result += 1;
            }
            else if(i == 1000){
                
            }
            else{
                int target = i;
                int[] test = new int[3];
                test[2] = target % 10;
                target /= 10;
                test[1] = target % 10;
                target /= 10;
                test[0] = target;
                if((test[1] - test[0]) == (test[2] - test[1])){
                    result += 1;
                }
            }
        }
        
        System.out.println(result);
    }
}