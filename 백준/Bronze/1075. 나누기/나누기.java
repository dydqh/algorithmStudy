import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());
        int target = N / F * F;
        int N100 = N / 100;
        int T100 = target / 100;

        if(N100 == T100){
            while(N100 == T100){
                target -= F;
                T100 = target / 100;
            }
            target += F;
        }
        else{
            while(N100 != T100){
                target += F;
                T100 = target / 100;
            }
        }

        System.out.println(target % 100 < 10 ? "0" + target % 100 : target % 100);
    }
}