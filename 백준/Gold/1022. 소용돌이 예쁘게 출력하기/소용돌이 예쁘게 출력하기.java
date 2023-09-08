import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");
        int r1 = Integer.parseInt(input[0]);
        int c1 = Integer.parseInt(input[1]);
        int r2 = Integer.parseInt(input[2]);
        int c2 = Integer.parseInt(input[3]);
        int[][] result = new int[r2 - r1 + 1][c2 - c1 + 1];

        int[][] boundary = new int[4][5001];
        boundary[0][0] = 1; //TR
        boundary[1][0] = 1; //TL
        boundary[2][0] = 1; //BR
        boundary[3][0] = 1; //BL

        for(int i = 1 ; i < 5001 ; i++){
            boundary[2][i] = (i * 2 + 1) * (i * 2 + 1);
            boundary[3][i] = boundary[2][i] - (i * 2);
            boundary[1][i] = boundary[3][i] - (i * 2);
            boundary[0][i] = boundary[1][i] - (i * 2);
        }

        for(int i = 0 ; i < result.length ; i++){
            for(int j = 0 ; j < result[i].length ; j++){
                result[i][j] = getNumber(boundary, r1 + i, c1 + j);
            }
        }

        int max = 0;
        max = max > result[0][0] ? max : result[0][0];
        max = max > result[result.length - 1][result[0].length - 1] ? max : result[result.length - 1][result[0].length - 1];
        max = max > result[0][result[0].length - 1] ? max : result[0][result[0].length - 1];
        max = max > result[result.length - 1][0] ? max : result[result.length - 1][0];
        int blankNumber = 1;

        while(max >= 10){
            max /= 10;
            blankNumber *= 10;
        }

        for(int i = 0 ; i < result.length ; i++){
            for(int j = 0 ; j < result[i].length ; j++){
                if(result[i][j] >= blankNumber){
                    sb.append(result[i][j]).append(" ");
                }
                else{
                    int tempBlankNumber = blankNumber;
                    while(result[i][j] < tempBlankNumber){
                        sb.append(" ");
                        tempBlankNumber /= 10;
                    }
                    sb.append(result[i][j]).append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int getNumber(int[][] boundary, int curR, int curC){
        int rSize = Math.abs(curR);
        int cSize = Math.abs(curC);
        if(curR <= 0 && curC <= 0){ //TL
            if(rSize > cSize){
                return boundary[1][rSize] - (rSize - cSize);
            }
            else{
                return boundary[1][cSize] + (cSize - rSize);
            }
        }
        else if(curR <= 0 && curC > 0){ //TR
            if(rSize > cSize){
                return boundary[0][rSize] + (rSize - cSize);
            }
            else{
                return boundary[0][cSize] - (cSize - rSize);
            }
        }
        else if(curR > 0 && curC <= 0){ //BL
            if(rSize > cSize){
                return boundary[3][rSize] + (rSize - cSize);
            }
            else{
                return boundary[3][cSize] - (cSize - rSize);
            }
        }
        else if(curR > 0 && curC > 0){ //BR
            if(rSize > cSize){
                return boundary[2][rSize] - (rSize - cSize);
            }
            else if(rSize < cSize){
                return boundary[2][cSize - 1] + (cSize - rSize);
            }
            else{
                return boundary[2][rSize];
            }
        }
        else{
            return 0;
        }
    }
}