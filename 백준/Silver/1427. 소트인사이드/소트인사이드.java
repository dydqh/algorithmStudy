import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int[] count = new int[10];
        String input = br.readLine();

        for(int i = 0 ; i < input.length(); i++){
            count[input.charAt(i) - 48] += 1;
        }

        for(int i = 9 ; i >= 0 ; i--){
            for(int j = 0 ; j < count[i] ; j++){
                sb.append(i);
            }
        }

        System.out.println(sb.toString());
    }
}