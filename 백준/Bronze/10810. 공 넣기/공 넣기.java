import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] basket = new int[n];
        
        for(int i = 0 ; i < m ; i++){
            String[] curInput = br.readLine().split(" ");
            int start = Integer.parseInt(curInput[0]) - 1;
            int end = Integer.parseInt(curInput[1]);
            int target = Integer.parseInt(curInput[2]);
            for(int j = start ; j < end ; j++){
                basket[j] = target;
            }
        }
        
        for(int i = 0 ; i < n ; i++){
            sb.append(basket[i]).append(" ");
        }
        
        System.out.println(sb.toString());
    }
}