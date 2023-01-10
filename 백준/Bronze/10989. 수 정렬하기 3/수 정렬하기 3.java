import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        int[] count = new int[10001];

        for(int i = 0 ; i < n ; i++){
            int number = Integer.parseInt(br.readLine());
            count[number] += 1;
        }

        int index = 1;
        while(index < 10001){
            for(int i = 0 ; i < count[index] ; i++){
                sb.append(index).append("\n");
            }
            index += 1;
        }
        
        System.out.println(sb.toString());
    }
}