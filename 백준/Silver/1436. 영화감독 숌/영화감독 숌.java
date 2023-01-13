import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        int target = 666;

        while(true){
            String stringI = String.valueOf(target);

            for(int i = 0 ; i < stringI.length() - 2 ; i++){
                if(stringI.charAt(i) == 54 && stringI.charAt(i + 1) == 54 && stringI.charAt(i + 2) == 54){
                    list.add(target);
                    break;
                }
            }

            if(list.size() == N){
                break;
            }

            target++;
        }

        System.out.println(list.get(N - 1));
    }
}