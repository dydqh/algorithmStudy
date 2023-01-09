import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int count = 0;
        for(int i = 0 ; i < input.length ; i++){
            if(!input[i].equals("")){
                count += 1;
            }
        }
        System.out.println(count);
    }
}