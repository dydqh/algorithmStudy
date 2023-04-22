import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String target = br.readLine();
        int length = target.length();

        for(int i = (length + 1) / 2 ; i < length ; i++){
            sb.append(target.charAt(i));
        }

        System.out.println(target.substring(0, length / 2).equals(sb.reverse().toString()) ? 1 : 0);
    }
}