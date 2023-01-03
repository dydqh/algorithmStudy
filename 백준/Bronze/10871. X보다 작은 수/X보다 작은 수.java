import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int count = Integer.parseInt(input.split(" ")[0]);
        int target = Integer.parseInt(input.split(" ")[1]);
        StringBuffer sb = new StringBuffer();
        input = br.readLine();
        String[] numbers = input.split(" ");
        
        for(int i = 0 ; i < count ; i++){
            int temp = Integer.parseInt(numbers[i]);
            if(temp < target){
                sb.append(temp).append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}