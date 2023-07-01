import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        while(true){
            String input = br.readLine();
            if(input.equals("0")){
                break;
            }

            String frontPart = input.substring(0, input.length() / 2);
            String backPart = "";
            if(input.length() % 2 == 0){
                backPart = input.substring(input.length() / 2, input.length());
            }
            else{
                backPart = input.substring(input.length() / 2 + 1, input.length());
            }

            StringBuffer tempSb = new StringBuffer(backPart);
            if(tempSb.reverse().toString().equals(frontPart)){
                sb.append("yes").append("\n");
            }
            else{
                sb.append("no").append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}