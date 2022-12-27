import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        int hour = Integer.parseInt(input.split(" ")[0]);
        int minute = Integer.parseInt(input.split(" ")[1]);
        
        int time = hour * 60 + minute;
        time = time < 45 ? time += 1440 : time;
        time -= 45;
        
        hour = time / 60;
        minute = time % 60;

        StringBuffer sb = new StringBuffer();
        sb.append(hour + " " + minute);
        
        System.out.println(sb.toString());
    }
}