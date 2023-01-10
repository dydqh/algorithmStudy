import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        boolean[][] paper = new boolean[100][100];

        for(int i = 0 ; i < count ; i++){
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            for(int j = x ; j < x + 10 ; j++){
                for(int k = y ; k < y + 10 ; k++){
                    paper[j][k] = true;
                }
            }
        }

        int result = 0;
        for(int i = 0 ; i < 100 ; i++){
            for(int j = 0 ; j < 100 ; j++){
                if(paper[i][j]){
                    result += 1;
                }
            }
        }

        System.out.println(result);
    }
}