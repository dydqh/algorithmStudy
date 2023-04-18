import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int max = Math.max(Math.max(a, b), c);
        int sum = a + b + c;
        if(sum - max > max){
            System.out.println(sum);
        }
        else{
            System.out.println((sum - max) * 2 - 1);
        }
    }
}