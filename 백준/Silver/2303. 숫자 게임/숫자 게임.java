import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = -1;
        int index = 0;

        for(int i = 1 ; i <= n ; i++){
            int cur = calc(br.readLine().split(" "));
            if(cur >= max){
                max = cur;
                index = i;
            }
        }

        System.out.println(index);
    }
    
    public static int calc(String[] input){
        int[] temp = new int[5];
        for(int i = 0 ; i < 5 ; i++){
            temp[i] = Integer.parseInt(input[i]);
        }

        int max = 0;
        for(int i = 0 ; i < 3 ; i++){
            for(int j = i + 1 ; j < 4 ; j++){
                for(int k = j + 1 ; k < 5 ; k++){
                    int cur = (temp[i] + temp[j] + temp[k]) % 10;
                    max = cur > max ? cur : max;
                }
            }
        }

        return max;
    }
}