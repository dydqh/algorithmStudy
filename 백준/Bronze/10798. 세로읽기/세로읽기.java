import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String[][] array = new String[5][15];

        for(int i = 0 ; i < 5 ; i++){
            String input = br.readLine();

            for(int j = 0 ; j < input.length() ; j++){
                array[i][j] = String.valueOf(input.charAt(j));
            }
        }

        for(int i = 0 ; i < 15 ; i++){
            for(int j = 0 ; j < 5 ; j++){
                if(array[j][i] != null){
                    sb.append(array[j][i]);
                }
            }
        }

        System.out.println(sb.toString());
    }
}