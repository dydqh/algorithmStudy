import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] start = br.readLine().split(":");
        String[] end = br.readLine().split(":");
        int startSecond = Integer.parseInt(start[0]) * 3600 + Integer.parseInt(start[1]) * 60 + Integer.parseInt(start[2]);
        int endSecond = Integer.parseInt(end[0]) * 3600 + Integer.parseInt(end[1]) * 60 + Integer.parseInt(end[2]);

        int resultSecond = endSecond > startSecond ? endSecond - startSecond : endSecond - startSecond + (24 * 60 * 60);
        int second = resultSecond % 60;
        resultSecond /= 60;
        int minute = resultSecond % 60;
        int hour = resultSecond / 60;

        if(hour < 10){
            sb.append("0").append(hour);
        }
        else{
            sb.append(hour);
        }

        sb.append(":");

        if(minute < 10){
            sb.append("0").append(minute);
        }
        else{
            sb.append(minute);
        }

        sb.append(":");
        
        if(second < 10){
            sb.append("0").append(second);
        }
        else{
            sb.append(second);
        }

        System.out.println(sb.toString());
    }
}