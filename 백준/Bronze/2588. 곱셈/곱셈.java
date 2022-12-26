import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        
        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());
        
        int third = first * (second % 10);
        int fourth = first * (second % 100 / 10);
        int fifth = first * (second / 100);
        
        int sixth = third + fourth * 10 + fifth * 100;
        
        sb.append(third + "\n").append(fourth + "\n").append(fifth + "\n").append(sixth);
        System.out.println(sb.toString());
    }
}