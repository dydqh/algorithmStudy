import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int sum = Integer.parseInt(input[0]);
        int count = Integer.parseInt(input[1]);
        long result = 1;

        long small = sum / count;
        long largeCount = sum - (count * small);
        
        
        for(int i = 0 ; i < count ; i++){
            if(largeCount > 0){
                result *= (small + 1);
            }
            else{
                result *= small;
            }
            largeCount--;
        }

        System.out.println(result);
    }
}