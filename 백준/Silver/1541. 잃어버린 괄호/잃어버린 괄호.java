import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] part = input.split("-");
        int[] part_parseInt = new int[part.length];

        for(int i = 0 ; i < part.length ; i++){
            if(part[i].indexOf("+") == -1){
                part_parseInt[i] = Integer.parseInt(part[i]);
            }
            else{
                int temp = 0;
                String[] part_temp = part[i].split("\\+");
                
                for(int j = 0 ; j < part_temp.length ; j++){
                    temp += Integer.parseInt(part_temp[j]);
                }

                part_parseInt[i] = temp;
            }
        }

        int result = part_parseInt[0];
        for(int i = 1 ; i < part_parseInt.length ; i++){
            result -= part_parseInt[i];
        }

        System.out.println(result);
    }
}