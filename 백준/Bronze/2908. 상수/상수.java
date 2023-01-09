import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        StringBuffer sb = new StringBuffer(input[0]);
        int first = Integer.parseInt(sb.reverse().toString());
        sb = new StringBuffer(input[1]);
        int second = Integer.parseInt(sb.reverse().toString());
        
        System.out.println(first >= second ? first : second);
    }
}