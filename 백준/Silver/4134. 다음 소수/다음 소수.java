import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int caseCount = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < caseCount ; i++){
            long n = Long.parseLong(br.readLine());
            while(!isPrime(n)){
                n++;
            }
            sb.append(n).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static boolean isPrime(long number){
        if(number < 2) return false;
        for(int i = 2 ; i <= Math.sqrt(number) ; i++){
            if(number % i == 0) return false;
        }
        return true;
    }
}