import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] inputA = br.readLine().split(" ");
        int aRow = Integer.parseInt(inputA[0]);
        int aCol = Integer.parseInt(inputA[1]);
        int[][] a = new int[aRow][aCol];

        for(int i = 0 ; i < aRow ; i++){
            String[] input = br.readLine().split(" ");
            for(int j = 0 ; j < aCol ; j++){
                a[i][j] = Integer.parseInt(input[j]);
            }
        }
        
        String[] inputB = br.readLine().split(" ");
        int bRow = Integer.parseInt(inputB[0]);
        int bCol = Integer.parseInt(inputB[1]);
        int[][] b = new int[bRow][bCol];

        for(int i = 0 ; i < bRow ; i++){
            String[] input = br.readLine().split(" ");
            for(int j = 0 ; j < bCol ; j++){
                b[i][j] = Integer.parseInt(input[j]);
            }
        }

        int[][] result = new int[aRow][bCol];

        for(int i = 0 ; i < aRow ; i++){
            for(int j = 0 ; j < bCol ; j++){
                for(int k = 0 ; k < aCol ; k++){
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for(int i = 0 ; i < aRow ; i++){
            for(int j = 0 ; j < bCol ; j++){
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}