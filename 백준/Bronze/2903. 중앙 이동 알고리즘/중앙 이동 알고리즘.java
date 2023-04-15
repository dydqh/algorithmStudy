import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int start = 2;
        int plus = 1;

        for(int i = 0 ; i < number ; i++){
            start += plus;
            plus *= 2;
        }

        System.out.println(start * start);
    }
}