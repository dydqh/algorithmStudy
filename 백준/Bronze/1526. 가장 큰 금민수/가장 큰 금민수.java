import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i = 4 ; i < 1000000 ; i++){
            int cur = i;
            int target = cur;
            boolean isTarget = true;
            while(cur > 0){
                target = cur % 10;
                if(target == 4 || target == 7){
                    cur /= 10;
                }
                else{
                    isTarget = false;
                    break;
                }
            }
            if(isTarget){
                if(n >= i){
                    result = i;
                }
                else{
                    break;
                }
            }
        }

        System.out.println(result);
    }
}