import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        cal(X);
    }

    public static void cal(int X){
        StringBuffer sb = new StringBuffer();
        if(X == 1){
            System.out.println("1/1");
        }
        else{
            int number = 2;
            int start = 2;
            
            while(true){
                int end = start + number - 1;
                if(X >= start && X <= end){
                    if(number % 2 == 0){
                        sb.append(X - start + 1).append("/").append(number - X + start);
                        System.out.println(sb.toString());
                    }
                    else{
                        sb.append(number - X + start).append("/").append(X - start + 1);
                        System.out.println(sb.toString());
                    }
                    break;
                }
                start = end + 1;
                number += 1;
            }
        }
    }
}