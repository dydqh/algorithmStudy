import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Long> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for(long i = 0 ; i < 10000000000l ; i++){
            long curN = i;
            boolean isList = true;
            long number = -1;
            int count = 0;
            
            while(curN > 0){
                if(curN % 10 <= number){
                    i = curN + 1;
                    for(int j = 0 ; j < count ; j++){
                        i *= 10;
                    }
                    i -= 1;
                    isList = false;
                    break;
                }
                count++;
                number = curN % 10;
                curN /= 10;
            }

            if(isList){
                list.add(i);
            }
        }

        if(n < list.size()){
            System.out.println(list.get(n));
        }
        else{
            System.out.println(-1);
        }
    }
}