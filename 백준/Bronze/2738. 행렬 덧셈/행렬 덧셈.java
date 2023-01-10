import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        int[][] result = new int[row][col];
        
        for(int i = 0 ; i < row ; i++){
            String[] inputRow = br.readLine().split(" ");
            for(int j = 0 ; j < col ; j++){
                result[i][j] += Integer.parseInt(inputRow[j]);
            }
        }
        
        for(int i = 0 ; i < row ; i++){
            String[] inputRow = br.readLine().split(" ");
            for(int j = 0 ; j < col ; j++){
                result[i][j] += Integer.parseInt(inputRow[j]);
            }
        }
        
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
    }
}