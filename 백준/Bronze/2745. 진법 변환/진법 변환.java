import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int result = 0;
        String target = input[0];
        int number = Integer.parseInt(input[1]);
        int curNumber = 1;
        for(int i = target.length() - 1 ; i >= 0 ; i--){
            int cur = target.charAt(i);
            if(cur >= 48 && cur <= 58){
                result += (cur - 48) * curNumber;
            }
            else if(cur >= 65 && cur <= 90){
                result += (cur - 55) * curNumber;
            }
            curNumber *= number;
        }

        System.out.println(result);
    }
}