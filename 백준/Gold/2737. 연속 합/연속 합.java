import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int caseCount = Integer.parseInt(br.readLine());
        int[] sum = new int[65536];
        sum[1] = 1;

        for(int i = 2 ; i < 65536 ; i++){
            sum[i] = sum[i - 1] + i;
        }
        
        for(int i = 0 ; i < caseCount ; i++){
            int curCase = Integer.parseInt(br.readLine());
            int curResult = 0;
            int target = 2;

            while(curCase >= sum[target]){
                if((curCase - sum[target]) % target == 0){
                    curResult++;
                }
                target++;
            }

            sb.append(curResult).append("\n");
        }

        System.out.println(sb.toString());
    }
}