import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");

        for(int i = 0 ; i < N ; i++){
            int curNumber = Integer.parseInt(numbers[i]);
            if(i == 0){
                list.add(curNumber);
            }
            else{
                for(int j = list.size() - 1 ; j >= 0 ; j--){
                    if(list.get(j) < curNumber){
                        if(j == list.size() - 1){
                            list.add(curNumber);
                            break;
                        }
                        else{
                            list.set(j + 1, curNumber);
                            break;
                        }
                    }

                    if(j == 0){
                        list.set(0, curNumber);
                    }
                }
            }
        }

        System.out.println(list.size());
    }
}