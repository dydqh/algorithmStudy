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
            int start = Integer.parseInt(curInput[0]) - 1;
            int end = Integer.parseInt(curInput[1]) - 1;
            setReverseRow(basket, start, end);
        }
        
        for(int i = 0 ; i < n ; i++){
            sb.append(basket[i]).append(" ");
        }
        
        System.out.println(sb.toString());
    }
    
    public static void setReverseRow(int[] arr, int start, int end){
        for(int i = start ; i <= (end + start) / 2 ; i++){
            swap(arr, i, (end + start - i));
        }
    }
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}