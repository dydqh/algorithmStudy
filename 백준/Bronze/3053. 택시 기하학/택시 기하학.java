import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int r = Integer.parseInt(br.readLine());
        double pi = Math.PI;

        sb.append(String.format("%.6f", pi * r * r)).append("\n");
        sb.append(String.format("%.6f", (double)r * r * 2)).append("\n");

        System.out.println(sb.toString());
    }
}