import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] now = br.readLine().split(" ");
        String[] dDay = br.readLine().split(" ");

        int nY = Integer.parseInt(now[0]);
        int nM = Integer.parseInt(now[1]);
        int nD = Integer.parseInt(now[2]);
        int dY = Integer.parseInt(dDay[0]);
        int dM = Integer.parseInt(dDay[1]);
        int dD = Integer.parseInt(dDay[2]);

        int nowDate = getDate(nY, nM, nD);
        int dDayDate = getDate(dY, dM, dD);

        if(dY > nY + 1000 || (dY == nY + 1000 && dM > nM) || (dY == nY + 1000 && dM == nM && dD >= nD)){
            System.out.println("gg");
        }
        else{
            System.out.println("D-" + (dDayDate - nowDate));
        }
    }

    public static int getDate(int year, int month, int day){
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int date = 0;

        for(int i = 1 ; i < year ; i++){
            date += 365;

            if(i % 4 == 0){
                date += 1;

                if(i % 100 == 0){
                    date -= 1;

                    if(i % 400 == 0){
                        date += 1;
                    }
                }
            }
        }

        for(int i = 1 ; i < month ; i++){
            date += days[i];

            if(i == 2){
                if(year % 4 == 0){
                    date += 1;
    
                    if(year % 100 == 0){
                        date -= 1;
    
                        if(year % 400 == 0){
                            date += 1;
                        }
                    }
                }
            }
        }

        date += day;

        return date;
    }
}