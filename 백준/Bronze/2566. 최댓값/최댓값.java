import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        int size = 9;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int max = 0;
        int row = 0;
        int col = 0;

        for(int i = 0 ; i < size ; i++){
            String[] input = br.readLine().split(" ");
            for(int j = 0 ; j < size ; j++){
                if(Integer.parseInt(input[j]) >= max){
                    max = Integer.parseInt(input[j]);
                    row = i + 1;
                    col = j + 1;
                }
            }
        }

        sb.append(max).append("\n").append(row).append(" ").append(col);
        System.out.println(sb.toString());
    }
}