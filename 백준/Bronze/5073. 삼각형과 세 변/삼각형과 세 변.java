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
            
            int max = a;
            max = max > b ? max : b;
            max = max > c ? max : c;
            int min = a;
            min = min < b ? min : b;
            min = min < c ? min : c;
            int mid = a + b + c - max - min;
            
            if(a == b && b == c){
                sb.append("Equilateral").append("\n");
            }
            else if(max >= (min + mid)){
                sb.append("Invalid").append("\n");
            }
            else{
                if(a != b && b != c && c != a){
                    sb.append("Scalene").append("\n");
                }
                else{
                    sb.append("Isosceles").append("\n");
                }
            }
        }
        
        System.out.println(sb.toString());
    }
}