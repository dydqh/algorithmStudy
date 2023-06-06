import java.io.*;

class Main{
    public static int count = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println((long)n * n * n);
        System.out.println(3);
    }
}