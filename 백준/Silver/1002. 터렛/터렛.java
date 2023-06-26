import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < caseCount; i++) {
            String caseTemp = br.readLine();
            String[] array = caseTemp.split(" ");

            int x1 = Integer.parseInt(array[0]);
            int y1 = Integer.parseInt(array[1]);
            int r1 = Integer.parseInt(array[2]);
            int x2 = Integer.parseInt(array[3]);
            int y2 = Integer.parseInt(array[4]);
            int r2 = Integer.parseInt(array[5]);

            double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

            // 일치
            if (x1 == x2 && y1 == y2 && r1 == r2) {
                sb.append("-1 ");
            }

            // 외접
            else if ((r1 + r2) == distance){
                sb.append("1 ");
            }

            // 내접
            else if (Math.sqrt((double)(r2 - r1) * (r2 - r1)) == distance){
                sb.append("1 ");
            }

            // 떨어져있고 만나지 않는 원
            else if ((r1 + r2) < distance){
                sb.append("0 ");
            }

            // 두 점
            else if (Math.sqrt((double)(r2 - r1) * (r2 - r1)) < distance && distance < r1 + r2){
                sb.append("2 ");
            }

            // 나머지
             else{
                sb.append("0 ");
             }   
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }
}