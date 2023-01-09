import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        input = change(input, "c=");
        input = change(input, "c-");
        input = change(input, "dz=");
        input = change(input, "d-");
        input = change(input, "lj");
        input = change(input, "nj");
        input = change(input, "s=");
        input = change(input, "z=");
        
        System.out.println(input.length());
    }
    
    public static String change(String input, String check){
        while(input.indexOf(check) != -1){
            input = input.substring(0, input.indexOf(check)) + "A" +
                input.substring(input.indexOf(check) + check.length(), input.length());
        }
        return input;
    }
}