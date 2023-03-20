import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] basket = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            basket[i] = i + 1;
        }
        
        for(int i = 0 ; i < m ; i++){
            String[] curInput = br.readLine().split(" ");
            int a = Integer.parseInt(curInput[0]) - 1;
            int b = Integer.parseInt(curInput[1]) - 1;
            swap(basket, a, b);
        }
        
        for(int i = 0 ; i < n ; i++){
            sb.append(basket[i]).append(" ");
        }
        
        System.out.println(sb.toString());
    }
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}