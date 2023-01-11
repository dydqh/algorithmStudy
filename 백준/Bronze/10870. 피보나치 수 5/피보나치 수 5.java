import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(pivo(n));
    }

    public static int pivo(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        return pivo(n-1) + pivo(n-2);
    }
}