import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseCount = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for(int l = 0 ; l < caseCount ; l++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] count = new int[k + 1][n];
    
            for(int i = 0 ; i < n ; i++){
                count[0][i] = i + 1;
            }
    
            for(int i = 1 ; i <= k ; i++){
                int sum = 0;
                for(int j = 0 ; j < n ; j++){
                    count[i][j] = sum + count[i-1][j];
                    sum += count[i-1][j];
                }
            }

            sb.append(count[k][n - 1]).append("\n");
        }
        
        System.out.println(sb.toString());
    }
}