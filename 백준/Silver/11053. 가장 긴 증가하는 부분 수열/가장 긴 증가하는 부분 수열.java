import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        int[] list = new int[1001];
        list[0] = Integer.parseInt(numbers[0]);
        int size = 1;

        for(int i = 0 ; i < N ; i++){
            int curNumber = Integer.parseInt(numbers[i]);

            for(int j = size - 1 ; j >= 0 ; j--){
                if(list[j] < curNumber){
                    if(j == size - 1){
                        list[size] = curNumber;
                        size += 1;
                        break;
                    }
                    else{
                        list[j + 1] = curNumber;
                        break;
                    }
                }

                if(j == 0){
                    list[0] = curNumber;
                }
            }
        }

        System.out.println(size);
    }
}