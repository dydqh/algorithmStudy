import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int L = Integer.parseInt(input[1]);

        for(int i = L ; i <= 100 ; i++){
            double start = (N - (i * (i - 1) / 2)) / (double)i;

            if(start < 0){
                System.out.println(-1);
                break;
            }

            if((int)start == start){
                long sum = 0;

                while(sum < N){
                    sb.append((int)start).append(" ");
                    sum += start;
                    start += 1;
                }
                
                if(sum == N){
                    System.out.println(sb.toString());
                    break;
                }
                else{
                    sb.setLength(0);
                }
            }

            if(i == 100){
                System.out.println(-1);
            }
        }
    }
}