import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int hour = Integer.parseInt(input.split(" ")[0]);
        int minute = Integer.parseInt(input.split(" ")[1]);
        
        int time = Integer.parseInt(br.readLine());
        int total = hour * 60 + minute + time;
        int resultTime = total > 2400 ? total - 2400 : total;
        int totalHour = resultTime / 60 >= 24 ? resultTime / 60 - 24 : resultTime / 60;
        int totalMinute = resultTime % 60;

        StringBuffer sb = new StringBuffer();
        sb.append(totalHour).append(" ").append(totalMinute);
        System.out.println(sb.toString());
    }
}