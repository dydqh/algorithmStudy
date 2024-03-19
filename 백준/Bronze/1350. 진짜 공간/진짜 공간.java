import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long answer = 0;
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int cluster = Integer.parseInt(br.readLine());
        for(String file : input){
            long fileSize = Long.parseLong(file);
            answer += (int)((fileSize + cluster - 1) / cluster) * cluster;
        }
        System.out.println(answer);
    }
}