import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        input = br.readLine().split(",");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        for(int i = 0 ; i < k ; i++) {
            int[] temp = new int[n - i - 1];
            for (int j = 0; j < n - i - 1; j++) {
                temp[j] = arr[j + 1] - arr[j];
                arr[j] = temp[j];
            }
        }
        for(int i = 0 ; i < n - k ; i++){
            sb.append(arr[i]).append(",");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb.toString());
    }
}