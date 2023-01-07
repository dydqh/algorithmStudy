import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0 ; i < count ; i++){
            String[] input = br.readLine().split(" ");
            double sumScore = 0;
            for(int j = 1 ; j < input.length ; j++){
                sumScore += Integer.parseInt(input[j]);
            }
            double average = sumScore / (input.length - 1);
            int resultCount = 0;
            for(int j = 1 ; j < input.length ; j++){
                if(Integer.parseInt(input[j]) > average){
                    resultCount += 1;
                }
            }
            sb.append(String.format("%.3f", (double)resultCount / (input.length - 1) * 100)).append('%').append('\n');
        }
        
        System.out.println(sb.toString());
    }
}