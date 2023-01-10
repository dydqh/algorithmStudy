import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = -1;
        int target = N / 5;
        
        if(N % 5 == 3){
            result = target + 1;
        }
        else if(target == 0){
            if(N % 3 == 0){
                result = N / 3;
            }
        }
        else{
            while(target > -1){
                if((N - (target * 5)) % 3 == 0){
                    result = target + ((N - (target * 5)) / 3);
                    break;
                }
                target -= 1;
            }
        }
        System.out.println(result);
    }
}