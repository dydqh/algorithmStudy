import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        int e = Integer.parseInt(input[4]);
        int f = Integer.parseInt(input[5]);

        System.out.println(getXY(a, b, c, d, e, f));
    }

    public static String getXY(int a, int b, int c, int d, int e, int f){
        int x = 0;
        int y = 0;
        for(int i = -999 ; i <= 999 ; i++){
            for(int j = -999 ; j <= 999 ; j++){
                if(i * a + j * b == c && i * d + j * e == f){
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        return x + " " + y;
    }
}