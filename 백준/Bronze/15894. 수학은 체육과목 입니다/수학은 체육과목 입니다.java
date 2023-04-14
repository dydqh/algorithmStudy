import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long number = Long.parseLong(br.readLine());
        System.out.println(number * 4);
    }
}