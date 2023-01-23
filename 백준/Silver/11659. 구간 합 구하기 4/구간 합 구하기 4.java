import java.io.*;

class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] inputCount = br.readLine().split(" ");
        int numbersCount = Integer.parseInt(inputCount[0]);
        int caseCount = Integer.parseInt(inputCount[1]);
        String[] numbers = br.readLine().split(" ");
        int[] sum = new int[numbersCount];
        
        sum[0] = Integer.parseInt(numbers[0]);
        
        for(int i = 1 ; i < numbersCount ; i++){
            sum[i] = sum[i - 1] + Integer.parseInt(numbers[i]); 
        }
        
        for(int i = 0 ; i < caseCount ; i++){
            String[] temp = br.readLine().split(" ");
            int origin = sum[Integer.parseInt(temp[1]) - 1];
            int minus = temp[0].equals("1") ? 0 : sum[Integer.parseInt(temp[0]) -2];
            sb.append(origin - minus).append("\n");
        }
        
        System.out.println(sb.toString());
    }
}