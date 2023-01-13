import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        while(true){
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);

            if(a == 0 && b == 0 && c == 0){
                break;
            }

            if(a > b && a > c){
                if(a*a == b*b + c*c){
                    sb.append("right").append("\n");
                }
                else{
                    sb.append("wrong").append("\n");
                }
            }
            else if(b > a && b > c){
                if(b*b == a*a + c*c){
                    sb.append("right").append("\n");
                }
                else{
                    sb.append("wrong").append("\n");
                }
            }
            else if(c > a && c > b){
                if(c*c == a*a + b*b){
                    sb.append("right").append("\n");
                }
                else{
                    sb.append("wrong").append("\n");
                }
            }
        }

        System.out.println(sb.toString());
    }
}