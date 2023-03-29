import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        while(true){
            int number = Integer.parseInt(br.readLine());
            if(number == -1){
                break;
            }

            int sum = 0;
            sb.append(number).append(" = ");
            for(int i = 1 ; i <= number / 2 ; i++){
                if(number % i != 0){
                    continue;
                }
                sum += i;
                sb.append(i).append(" + ");
            }
            if(sum == number){
                sb.setLength(sb.length() - 3);
                System.out.println(sb.toString());
                sb.setLength(0);
            }
            else{
                sb.setLength(0);
                sb.append(number).append(" is NOT perfect.");
                System.out.println(sb.toString());
                sb.setLength(0);
            }
        }
    }
}