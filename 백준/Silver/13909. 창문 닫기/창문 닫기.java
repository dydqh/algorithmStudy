import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int result = 0;
        int index = 1;

        while(true){
            result++;
            index++;
            int curIndex = index * index;
            if(curIndex > number){
                break;
            }
        }

        System.out.println(result);
    }
}