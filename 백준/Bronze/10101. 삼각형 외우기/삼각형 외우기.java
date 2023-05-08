import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String result = "";

        if(a + b + c == 180){
            if(a == b){
                if(b == c){
                    result = "Equilateral";
                }
                else if(a == c){
                    result = "Equilateral";
                }
                else{
                    result = "Isosceles";
                }
            }
            else{
                if(a == c){
                    result = "Isosceles";
                }
                else if(b == c){
                    result = "Isosceles";
                }
                else{
                    result = "Scalene";
                }
            }
        }
        else{
            result = "Error";
        }

        System.out.println(result);
    }
}