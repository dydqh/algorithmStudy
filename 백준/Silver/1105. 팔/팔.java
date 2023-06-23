import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int L = Integer.parseInt(input[0]);
        int R = Integer.parseInt(input[1]);
        List<Integer> lList = new ArrayList<>();
        List<Integer> rList = new ArrayList<>();

        int result = 0;

        if(L == R){
            while(L > 0){
                if(L % 10 == 8){
                    result++;
                }
                L /= 10;
            }
        }
        else{
            while(L > 0){
                lList.add(L % 10);
                L /= 10;
            }
    
            while(R > 0){
                rList.add(R % 10);
                R /= 10;
            }
            
            if(lList.size() != rList.size()){
                result = 0;
            }
            else{
                for(int i = lList.size() - 1 ; i >= 0 ; i--){
                    if(lList.get(i) == 8 && rList.get(i) == 8){
                        result++;
                    }
                    else if(lList.get(i) != rList.get(i)){
                        break;
                    }
                }
            }
        }

        System.out.println(result);
    }
}